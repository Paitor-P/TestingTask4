package com.viktor.lab4.trace;

import org.jacoco.agent.rt.IAgent;
import org.jacoco.agent.rt.RT;
import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.analysis.CoverageBuilder;
import org.jacoco.core.analysis.IClassCoverage;
import org.jacoco.core.analysis.ILine;
import org.jacoco.core.analysis.ICounter;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.SessionInfoStore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class TraceCollector {
    private TraceCollector() {
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> params = parseArgs(args);
        String targetClass = required(params, "--targetClass");
        String scope = params.getOrDefault("--scope", "top-level");
        if (!scope.equals("top-level") && !scope.equals("class-family")) {
            throw new IllegalArgumentException("Unknown scope: " + scope);
        }
        if (params.containsKey("--describe")) {
            System.out.println(buildCoverage(targetClass, new ExecutionDataStore(), scope, true));
            return;
        }
        String testClass = required(params, "--testClass");
        String testMethod = required(params, "--testMethod");

        IAgent agent = RT.getAgent();
        agent.reset();

        Result result = runSingleTest(testClass, testMethod);

        byte[] execData = agent.getExecutionData(false);
        ExecutionDataStore store = new ExecutionDataStore();
        SessionInfoStore session = new SessionInfoStore();
        readExecutionData(execData, store, session);

        String vector = buildCoverage(targetClass, store, scope, false);
        System.out.println(vector);

        if (!result.wasSuccessful()) {
            System.err.println("Test failed: " + testClass + "#" + testMethod);
            System.exit(1);
        }
    }

    private static Result runSingleTest(String testClass, String testMethod) throws ClassNotFoundException {
        Class<?> cls = Class.forName(testClass);
        Request request = Request.method(cls, testMethod);
        JUnitCore core = new JUnitCore();
        return core.run(request);
    }

    private static void readExecutionData(byte[] execData, ExecutionDataStore store, SessionInfoStore session) throws IOException {
        try (ByteArrayInputStream input = new ByteArrayInputStream(execData)) {
            ExecutionDataReader reader = new ExecutionDataReader(input);
            reader.setExecutionDataVisitor(store);
            reader.setSessionInfoVisitor(session);
            while (reader.read()) {
                // read all blocks
            }
        }
    }

    private static String buildCoverage(String targetClass, ExecutionDataStore store, String scope, boolean describe) throws Exception {
        CoverageBuilder coverageBuilder = new CoverageBuilder();
        Analyzer analyzer = new Analyzer(store, coverageBuilder);
        String resource = targetClass.replace('.', '/') + ".class";

        if (scope.equals("class-family")) {
            // Enumerate compiled files, not loaded classes: unexecuted nested classes
            // must still contribute zero coordinates to every tool's vector.
            URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
            if (url == null || !url.getProtocol().equals("file")) {
                throw new IllegalStateException("class-family requires a compiled classes directory: " + targetClass);
            }
            Path outer = Path.of(url.toURI());
            String stem = outer.getFileName().toString().replaceFirst("\\.class$", "");
            try (var files = Files.list(outer.getParent())) {
                for (Path file : files.filter(p -> {
                    String name = p.getFileName().toString();
                    return name.equals(stem + ".class") || (name.startsWith(stem + "$") && name.endsWith(".class"));
                }).sorted().toList()) {
                    analyzer.analyzeAll(file.toFile());
                }
            }
        } else try (InputStream classStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource)) {
            if (classStream == null) {
                throw new IllegalStateException("Target class not found on classpath: " + targetClass);
            }
            analyzer.analyzeClass(classStream, targetClass);
        }

        String internalName = targetClass.replace('.', '/');
        List<IClassCoverage> classes = coverageBuilder.getClasses().stream()
            .filter(c -> c.getName().equals(internalName)
                || (scope.equals("class-family") && c.getName().startsWith(internalName + "$")))
            .sorted(Comparator.comparing(IClassCoverage::getName)).toList();
        if (classes.isEmpty()) throw new IllegalStateException("Coverage for class not found: " + targetClass);

        StringBuilder vector = new StringBuilder();
        for (IClassCoverage classCoverage : classes) {
          for (int line = classCoverage.getFirstLine(); line <= classCoverage.getLastLine(); line++) {
            ILine lineInfo = classCoverage.getLine(line);
            if (lineInfo.getStatus() == ICounter.EMPTY) {
                continue;
            }
            boolean covered = lineInfo.getStatus() == ICounter.PARTLY_COVERED
                || lineInfo.getStatus() == ICounter.FULLY_COVERED;
            if (vector.length() > 0) {
                vector.append(',');
            }
            if (describe) vector.append(classCoverage.getName()).append('#').append(line);
            else vector.append(covered ? '1' : '0');
          }
        }
        return vector.toString();
    }

    private static Map<String, String> parseArgs(String[] args) {
        Map<String, String> params = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            String key = args[i];
            if (!key.startsWith("--")) {
                continue;
            }
            if (i + 1 >= args.length) {
                throw new IllegalArgumentException("Missing value for " + key);
            }
            params.put(key, args[++i]);
        }
        return params;
    }

    private static String required(Map<String, String> params, String key) {
        String value = params.get(key);
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Missing required argument: " + key);
        }
        return value;
    }
}

