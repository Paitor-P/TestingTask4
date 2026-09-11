package com.viktor.lab4;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReferenceExamplesTest {

    private static final Path REFERENCE_DIR = Path.of("src", "test", "resources", "reference");

    @Test
    void lruCacheMatchesReferenceOutput() throws IOException {
        List<?> operations = (List<?>) parseFile("lru-cache-input.json");
        LruCache<String, String> cache = new LruCache<>(2);
        List<String> actual = new ArrayList<>();

        for (Object item : operations) {
            List<?> operation = (List<?>) item;
            String command = String.valueOf(operation.get(0));
            String key = operation.size() > 1 ? String.valueOf(operation.get(1)) : "";
            switch (command) {
                case "PUT" -> cache.put(key, String.valueOf(operation.get(2)));
                case "GET" -> actual.add("GET " + key + "=" + cache.get(key));
                case "CONTAINS" -> actual.add("CONTAINS " + key + "=" + cache.containsKey(key));
                case "SIZE" -> actual.add("SIZE=" + cache.size());
                default -> throw new IllegalArgumentException("Unknown operation: " + command);
            }
        }

        assertEquals(Files.readAllLines(REFERENCE_DIR.resolve("lru-cache-expected.txt")), actual);
    }

    @Test
    void pricingEngineMatchesReferenceOutput() throws IOException {
        List<?> values = (List<?>) parseFile("pricing-input.json");
        PricingEngine.PricingRequest request = new PricingEngine.PricingRequest(
                number(values, 0).doubleValue(),
                number(values, 1).intValue(),
                PricingEngine.CustomerType.valueOf(String.valueOf(values.get(2))),
                Boolean.parseBoolean(String.valueOf(values.get(3))),
                String.valueOf(values.get(4)),
                Boolean.parseBoolean(String.valueOf(values.get(5))),
                number(values, 6).intValue()
        );
        double expected = Double.parseDouble(readExpected("pricing-expected.txt"));

        assertEquals(expected, new PricingEngine().calculateFinalPrice(request));
    }

    @Test
    void jsonParserMatchesReferenceOutput() throws IOException {
        assertEquals(readExpected("json-parser-expected.txt"), String.valueOf(parseFile("json-parser-input.json")));
    }

    private Object parseFile(String name) throws IOException {
        return new SimpleJsonParser().parse(Files.readString(REFERENCE_DIR.resolve(name)));
    }

    private String readExpected(String name) throws IOException {
        return Files.readString(REFERENCE_DIR.resolve(name)).trim();
    }

    private Number number(List<?> values, int index) {
        return (Number) values.get(index);
    }
}
