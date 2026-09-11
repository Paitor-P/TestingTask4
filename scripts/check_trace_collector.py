"""Small Java fixture integration check; never generates or measures research suites."""
import argparse
import os
import subprocess
import tempfile
from pathlib import Path
from analysis_support import PROJECT_ROOT
from analyze_trace_similarity import run_trace_method


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--java-home', default='C:/Users/user/.jdks/jbr-17.0.14')
    args = parser.parse_args()
    cache = Path.home() / '.gradle/caches/modules-2/files-2.1'
    jars = []
    for group, artifact, version in [('junit', 'junit', '4.13.2'), ('org.hamcrest', 'hamcrest-core', '1.3'),
            ('org.jacoco', 'org.jacoco.core', '0.8.12'), ('org.jacoco', 'org.jacoco.agent', '0.8.12'),
            ('org.ow2.asm', 'asm', '9.7'), ('org.ow2.asm', 'asm-commons', '9.7'), ('org.ow2.asm', 'asm-tree', '9.7')]:
        matches = [p for p in (cache / group / artifact / version).glob('*/*.jar')
                   if not p.name.endswith(('-sources.jar', '-javadoc.jar'))]
        if not matches:
            raise RuntimeError(f'Build Gradle classes first; missing dependency {artifact}')
        jars.append(str(matches[0]))
    work = Path(tempfile.mkdtemp(prefix='trace-family-fixture-', dir=PROJECT_ROOT / 'build'))
    (work / 'Outer.java').write_text('''package fixture;
public class Outer {
 public int value() { return 1; }
 public static class Nested { public int value() { return 2; } }
 public int anonymous() {
  return new java.util.function.IntSupplier() {
   public int getAsInt() { return 3; }
  }.getAsInt();
 }
}
class OuterHelper { public int value() { return 99; } }
''')
    (work / 'FixtureTest.java').write_text('''package fixture;
public class FixtureTest {
 @org.junit.Test public void outerOnly() { org.junit.Assert.assertEquals(1, new Outer().value()); }
 @org.junit.Test public void family() {
  org.junit.Assert.assertEquals(2, new Outer.Nested().value());
  org.junit.Assert.assertEquals(3, new Outer().anonymous());
 }
 @org.junit.Test public void fails() { org.junit.Assert.fail("intentional fixture failure"); }
}
''')
    java = str(Path(args.java_home) / 'bin/java.exe')
    javac = str(Path(args.java_home) / 'bin/javac.exe')
    cp = os.pathsep.join([str(work), str(PROJECT_ROOT / 'build/classes/java/main'), *jars])
    subprocess.run([javac, '--release', '17', '-cp', cp, '-d', str(work), str(work / 'Outer.java'), str(work / 'FixtureTest.java')], check=True)
    coords = subprocess.check_output([java, '-cp', cp, 'com.viktor.lab4.trace.TraceCollector',
        '--targetClass', 'fixture.Outer', '--scope', 'class-family', '--describe', 'true'], text=True).strip().split(',')
    assert any('Outer$Nested#' in c for c in coords)
    assert any('Outer$1#' in c for c in coords)
    assert not any('OuterHelper' in c for c in coords)
    agent = next(j for j in jars if 'org.jacoco.agent-' in j)
    vectors = {}
    for method in ('outerOnly', 'family'):
        vector = run_trace_method(java, cp, agent, 'fixture.Outer', 'fixture.FixtureTest', method, work / 'trace.exec', 'class-family')
        assert vector is not None
        vectors[method] = vector.split(',')
        assert len(vectors[method]) == len(coords)
    nested = [i for i, c in enumerate(coords) if '$' in c]
    assert all(vectors['outerOnly'][i] == '0' for i in nested), 'Unloaded nested classes must have zero coordinates'
    assert any(vectors['family'][i] == '1' for i in nested), 'Nested execution was not instrumented'
    assert run_trace_method(java, cp, agent, 'fixture.Outer', 'fixture.FixtureTest', 'fails', work / 'trace.exec', 'class-family') is None
    print(f'TRACE FIXTURE PASSED: {len(coords)} stable class/line coordinates; unloaded nested classes and failures checked')


if __name__ == '__main__':
    main()
