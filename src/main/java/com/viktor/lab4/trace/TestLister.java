package com.viktor.lab4.trace;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public final class TestLister {
    private TestLister() {
    }

    public static void main(String[] args) throws Exception {
        Map<String, String> params = parseArgs(args);
        String testClass = required(params, "--testClass");

        Class<?> cls = Class.forName(testClass);
        boolean isJUnit3 = junit.framework.TestCase.class.isAssignableFrom(cls);

        List<String> methods = new ArrayList<>();
        for (Method method : cls.getMethods()) {
            if (method.getParameterCount() != 0 || method.getReturnType() != void.class) {
                continue;
            }
            if (method.getAnnotation(Test.class) != null) {
                methods.add(method.getName());
                continue;
            }
            if (isJUnit3 && method.getName().startsWith("test")) {
                methods.add(method.getName());
            }
        }

        methods.stream()
            .sorted(Comparator.naturalOrder())
            .forEach(System.out::println);
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

