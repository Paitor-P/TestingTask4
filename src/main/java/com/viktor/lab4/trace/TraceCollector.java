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
import java.util.HashMap;
import java.util.Map;

public final class TraceCollector {
    private TraceCollector() {
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> params = parseArgs(args);
        String targetClass = required(params, "--targetClass");
        String testClass = required(params, "--testClass");
        String testMethod = required(params, "--testMethod");

        IAgent agent = RT.getAgent();
        agent.reset();

        Result result = runSingleTest(testClass, testMethod);

        byte[] execData = agent.getExecutionData(false);
        ExecutionDataStore store = new ExecutionDataStore();
        SessionInfoStore session = new SessionInfoStore();
        readExecutionData(execData, store, session);

        String vector = buildCoverageVector(targetClass, store);
        System.out.println(vector);

        if (!result.wasSuccessful()) {
            System.err.println("Test failed: " + testClass + "#" + testMethod);
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

    private static String buildCoverageVector(String targetClass, ExecutionDataStore store) throws IOException {
        CoverageBuilder coverageBuilder = new CoverageBuilder();
        Analyzer analyzer = new Analyzer(store, coverageBuilder);
        String resource = targetClass.replace('.', '/') + ".class";

        try (InputStream classStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource)) {
            if (classStream == null) {
                throw new IllegalStateException("Target class not found on classpath: " + targetClass);
            }
            analyzer.analyzeClass(classStream, targetClass);
        }

        String internalName = targetClass.replace('.', '/');
        IClassCoverage classCoverage = coverageBuilder.getClasses().stream()
            .filter(c -> c.getName().equals(internalName))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("Coverage for class not found: " + targetClass));

        StringBuilder vector = new StringBuilder();
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
            vector.append(covered ? '1' : '0');
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

