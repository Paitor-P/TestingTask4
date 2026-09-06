plugins {
    id("java")
    id("idea")
    id("jacoco")
    id("info.solidsoft.pitest") version "1.15.0"
}

group = "com.viktor.lab"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

jacoco {
    toolVersion = "0.8.12"
}

configurations.register("jacocoRuntime")

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.13.2")
    testImplementation(files("tools/evosuite-1.2.0.jar"))
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("junit:junit:4.13.2")
    implementation("org.jacoco:org.jacoco.core:0.8.12")
    implementation("org.jacoco:org.jacoco.agent:0.8.12:runtime")
    add("jacocoRuntime", "org.jacoco:org.jacoco.agent:0.8.12:runtime")
}

// Each experiment contains duplicate test class names; compile one suite at a time.
val generatedSuite = providers.gradleProperty("generatedSuite")
    .orElse("Randoop/LongestIncreasingSubsequence/30/run1-seed101")
val generatedTestsDir = providers.gradleProperty("generatedTestsDir")
    .orElse(generatedSuite.map { "src/generatedTest/suites/$it" })

val customBuildDir = providers.gradleProperty("buildDir").orNull
if (customBuildDir != null) {
    layout.buildDirectory.set(file(customBuildDir))
}

sourceSets {
    create("generatedTest") {
        java.setSrcDirs(listOf(generatedTestsDir.get()))
        compileClasspath += sourceSets["main"].output + configurations["testRuntimeClasspath"]
        runtimeClasspath += output + compileClasspath
    }
}

configurations.named("generatedTestImplementation") {
    extendsFrom(configurations["testImplementation"])
}
configurations.named("generatedTestRuntimeOnly") {
    extendsFrom(configurations["testRuntimeOnly"])
}


tasks.withType<JavaCompile>().configureEach {
    options.release.set(17)
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}

val generatedTest = tasks.register<Test>("generatedTest") {
    description = "Runs one suite selected by -PgeneratedSuite or -PgeneratedTestsDir"
    group = "verification"
    testClassesDirs = sourceSets["generatedTest"].output.classesDirs
    classpath = sourceSets["generatedTest"].runtimeClasspath
    useJUnit()
    ignoreFailures = true
    jvmArgs(
        "-Djava.security.manager=allow",
        "--add-opens", "java.base/java.net=ALL-UNNAMED",
        "--add-opens", "java.desktop/java.awt=ALL-UNNAMED",
        "--add-opens", "java.base/java.lang=ALL-UNNAMED",
        "--add-opens", "java.base/java.util=ALL-UNNAMED"
    )
}

tasks.register<Delete>("cleanGeneratedAnalysis") {
    delete(
        layout.buildDirectory.dir("classes/java/generatedTest"),
        layout.buildDirectory.dir("tmp/compileGeneratedTestJava"),
        layout.buildDirectory.dir("test-results/generatedTest"),
        layout.buildDirectory.dir("reports/tests/generatedTest"),
        layout.buildDirectory.dir("reports/jacoco/generated"),
        layout.buildDirectory.dir("reports/pitest/generated"),
        layout.buildDirectory.file("jacoco/generatedTest.exec")
    )
}

tasks.register<JacocoReport>("jacocoGeneratedTestReport") {
    dependsOn(generatedTest)
    executionData(layout.buildDirectory.file("jacoco/generatedTest.exec"))
    classDirectories.setFrom(sourceSets["main"].output)
    sourceDirectories.setFrom(sourceSets["main"].allSource.srcDirs)
    reports {
        xml.required.set(true)
        xml.outputLocation.set(layout.buildDirectory.file("reports/jacoco/generated/jacocoGeneratedTestReport.xml"))
        html.required.set(true)
        html.outputLocation.set(layout.buildDirectory.dir("reports/jacoco/generated/html"))
    }
}

tasks.register("printJacocoAgentPath") {
    doLast {
        println(configurations["jacocoRuntime"].singleFile.absolutePath)
    }
}

tasks.register("printGeneratedTestClasspath") {
    doLast {
        println(sourceSets["generatedTest"].runtimeClasspath.asPath)
    }
}

pitest {
    targetClasses.set(
        setOf(providers.gradleProperty("pitTargetClass").orElse("com.viktor.lab4.*").get())
    )
    targetTests.set(
        setOf(providers.gradleProperty("pitTargetTests").orElse("com.viktor.lab4.*").get())
    )
    mainSourceSets.set(listOf(sourceSets["main"]))
    testSourceSets.set(listOf(sourceSets["generatedTest"]))
    reportDir.set(layout.buildDirectory.dir("reports/pitest/generated"))
    outputFormats.set(setOf("XML", "HTML"))
    timestampedReports.set(false)
    failWhenNoMutations.set(false)
    threads.set(1)
    useClasspathFile.set(true)
    jvmArgs.set(
        listOf(
            "-Djava.security.manager=allow",
            "--add-opens=java.base/java.net=ALL-UNNAMED",
            "--add-opens=java.desktop/java.awt=ALL-UNNAMED",
            "--add-opens=java.base/java.lang=ALL-UNNAMED",
            "--add-opens=java.base/java.util=ALL-UNNAMED"
        )
    )
}

// Persist test-root semantics in IntelliJ; reports and Python environments are not sources.
idea {
    module {
        testSources.from(sourceSets["generatedTest"].java.srcDirs)
        excludeDirs.addAll(listOf(file("scripts/.venv"), file("reports")))
    }
}
