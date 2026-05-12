package com.viktor.lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleApp {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new ConsoleApp().run();
    }

    private void run() {
        while (true) {
            printMenu();
            String choice = readLine("Choose option: ");
            switch (choice) {
                case "1" -> runLongestIncreasingSubsequence();
                case "2" -> runLruCache();
                case "3" -> runPricingEngine();
                case "4" -> runJsonParser();
                case "0" -> {
                    System.out.println("Bye.");
                    return;
                }
                default -> System.out.println("Unknown option.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== Console App ===");
        System.out.println("1) Longest Increasing Subsequence");
        System.out.println("2) LRU Cache");
        System.out.println("3) Pricing Engine");
        System.out.println("4) Simple JSON Parser");
        System.out.println("0) Exit");
    }

    private void runLongestIncreasingSubsequence() {
        int[] numbers = readNumbersInput();
        if (numbers == null) {
            return;
        }
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int result = lis.lengthOfLIS(numbers);
        System.out.println("LIS length = " + result);
    }

    private void runLruCache() {
        Integer capacity = readIntValue("Capacity (>0): ");
        if (capacity == null) {
            return;
        }
        LruCache<String, String> cache = new LruCache<>(capacity);
        System.out.println("Enter operations: PUT key value | GET key | CONTAINS key | SIZE | IMPORT | DONE");

        while (true) {
            String line = readLine("> ");
            if (line.equalsIgnoreCase("DONE")) {
                break;
            }
            if (line.isBlank()) {
                continue;
            }
            String[] parts = line.trim().split("\\s+");
            String command = parts[0].toUpperCase(Locale.ROOT);
            switch (command) {
                case "PUT" -> {
                    if (parts.length < 3) {
                        System.out.println("Usage: PUT key value");
                        continue;
                    }
                    cache.put(parts[1], parts[2]);
                    System.out.println("OK");
                }
                case "GET" -> {
                    if (parts.length < 2) {
                        System.out.println("Usage: GET key");
                        continue;
                    }
                    System.out.println("Value: " + cache.get(parts[1]));
                }
                case "CONTAINS" -> {
                    if (parts.length < 2) {
                        System.out.println("Usage: CONTAINS key");
                        continue;
                    }
                    System.out.println("Contains: " + cache.containsKey(parts[1]));
                }
                case "SIZE" -> System.out.println("Size: " + cache.size());
                case "IMPORT" -> runLruCacheImport(cache);
                default -> System.out.println("Unknown command.");
            }
        }
    }

    private void runLruCacheImport(LruCache<String, String> cache) {
        String format = readLine("Import format (csv/json): ").trim().toLowerCase(Locale.ROOT);
        String path = readLine("File path: ").trim();
        String content = readFileContent(path);
        if (content == null) {
            return;
        }

        if ("csv".equals(format)) {
            List<String[]> rows = parseCsvRows(content);
            for (String[] row : rows) {
                if (row.length == 0) {
                    continue;
                }
                executeCacheOperation(cache, row);
            }
        } else if ("json".equals(format)) {
            SimpleJsonParser parser = new SimpleJsonParser();
            Object parsed = parser.parse(content);
            if (!(parsed instanceof List<?> list)) {
                System.out.println("JSON must be an array of arrays.");
                return;
            }
            for (Object item : list) {
                if (!(item instanceof List<?> op)) {
                    System.out.println("Each JSON item must be an array.");
                    return;
                }
                String[] row = op.stream().map(String::valueOf).toArray(String[]::new);
                executeCacheOperation(cache, row);
            }
        } else {
            System.out.println("Unsupported format.");
        }
    }

    private void executeCacheOperation(LruCache<String, String> cache, String[] row) {
        if (row.length == 0) {
            return;
        }
        String command = row[0].trim().toUpperCase(Locale.ROOT);
        switch (command) {
            case "PUT" -> {
                if (row.length < 3) {
                    System.out.println("PUT requires key and value.");
                    return;
                }
                cache.put(row[1].trim(), row[2].trim());
                System.out.println("OK");
            }
            case "GET" -> {
                if (row.length < 2) {
                    System.out.println("GET requires key.");
                    return;
                }
                System.out.println("Value: " + cache.get(row[1].trim()));
            }
            case "CONTAINS" -> {
                if (row.length < 2) {
                    System.out.println("CONTAINS requires key.");
                    return;
                }
                System.out.println("Contains: " + cache.containsKey(row[1].trim()));
            }
            case "SIZE" -> System.out.println("Size: " + cache.size());
            default -> System.out.println("Unknown command: " + command);
        }
    }

    private void runPricingEngine() {
        PricingEngine.PricingRequest request = readPricingRequest();
        if (request == null) {
            return;
        }
        PricingEngine engine = new PricingEngine();
        double total = engine.calculateFinalPrice(request);
        System.out.println("Total price: " + total);
    }

    private PricingEngine.PricingRequest readPricingRequest() {
        String mode = readLine("Input mode (manual/import): ").trim().toLowerCase(Locale.ROOT);
        if ("manual".equals(mode)) {
            Double basePrice = readDoubleValue("Base price: ");
            Integer quantity = readIntValue("Quantity: ");
            PricingEngine.CustomerType customerType = readCustomerType();
            Boolean seasonalSale = readBooleanValue("Seasonal sale (true/false): ");
            String couponCode = readLine("Coupon code (empty for none): ").trim();
            Boolean firstOrder = readBooleanValue("First order (true/false): ");
            Integer loyaltyPoints = readIntValue("Loyalty points: ");
            if (basePrice == null || quantity == null || customerType == null
                    || seasonalSale == null || firstOrder == null || loyaltyPoints == null) {
                return null;
            }
            if (couponCode.isEmpty()) {
                couponCode = null;
            }
            return new PricingEngine.PricingRequest(
                    basePrice,
                    quantity,
                    customerType,
                    seasonalSale,
                    couponCode,
                    firstOrder,
                    loyaltyPoints
            );
        }

        if ("import".equals(mode)) {
            String format = readLine("Import format (csv/json): ").trim().toLowerCase(Locale.ROOT);
            String path = readLine("File path: ").trim();
            String content = readFileContent(path);
            if (content == null) {
                return null;
            }
            return parsePricingRequest(format, content);
        }

        System.out.println("Unknown mode.");
        return null;
    }

    private PricingEngine.PricingRequest parsePricingRequest(String format, String content) {
        String[] tokens;
        if ("csv".equals(format)) {
            List<String[]> rows = parseCsvRows(content);
            if (rows.isEmpty()) {
                System.out.println("CSV is empty.");
                return null;
            }
            tokens = rows.get(0);
        } else if ("json".equals(format)) {
            SimpleJsonParser parser = new SimpleJsonParser();
            Object parsed = parser.parse(content);
            if (!(parsed instanceof List<?> list)) {
                System.out.println("JSON must be an array of values.");
                return null;
            }
            tokens = list.stream().map(String::valueOf).toArray(String[]::new);
        } else {
            System.out.println("Unsupported format.");
            return null;
        }

        if (tokens.length < 7) {
            System.out.println("Expected 7 values: basePrice, quantity, customerType, seasonalSale, couponCode, firstOrder, loyaltyPoints");
            return null;
        }

        try {
            double basePrice = Double.parseDouble(tokens[0].trim());
            int quantity = parseWholeNumber(tokens[1].trim(), "quantity");
            PricingEngine.CustomerType customerType = PricingEngine.CustomerType.valueOf(tokens[2].trim().toUpperCase(Locale.ROOT));
            boolean seasonalSale = Boolean.parseBoolean(tokens[3].trim());
            String couponCode = tokens[4].trim();
            boolean firstOrder = Boolean.parseBoolean(tokens[5].trim());
            int loyaltyPoints = parseWholeNumber(tokens[6].trim(), "loyaltyPoints");
            if (couponCode.isEmpty()) {
                couponCode = null;
            }
            return new PricingEngine.PricingRequest(
                    basePrice,
                    quantity,
                    customerType,
                    seasonalSale,
                    couponCode,
                    firstOrder,
                    loyaltyPoints
            );
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid data: " + ex.getMessage());
            return null;
        }
    }

    private int parseWholeNumber(String token, String fieldName) {
        double value = Double.parseDouble(token);
        if (value % 1 != 0) {
            throw new IllegalArgumentException(fieldName + " must be an integer");
        }
        return (int) value;
    }

    private void runJsonParser() {
        String mode = readLine("Input mode (manual/import): ").trim().toLowerCase(Locale.ROOT);
        String input;
        if ("manual".equals(mode)) {
            input = readLine("JSON input: ");
        } else if ("import".equals(mode)) {
            String path = readLine("File path: ");
            input = readFileContent(path);
            if (input == null) {
                return;
            }
        } else {
            System.out.println("Unknown mode.");
            return;
        }

        SimpleJsonParser parser = new SimpleJsonParser();
        try {
            Object result = parser.parse(input);
            System.out.println("Parsed value: " + result);
        } catch (IllegalArgumentException ex) {
            System.out.println("Parse error: " + ex.getMessage());
        }
    }

    private int[] readNumbersInput() {
        String mode = readLine("Input mode (manual/import): ").trim().toLowerCase(Locale.ROOT);
        String content;
        if ("manual".equals(mode)) {
            content = readLine("Numbers (space/comma separated): ");
        } else if ("import".equals(mode)) {
            String format = readLine("Import format (csv/json): ").trim().toLowerCase(Locale.ROOT);
            String path = readLine("File path: ");
            content = readFileContent(path);
            if (content == null) {
                return null;
            }
            if ("json".equals(format)) {
                return parseNumbersJson(content);
            }
            if (!"csv".equals(format)) {
                System.out.println("Unsupported format.");
                return null;
            }
        } else {
            System.out.println("Unknown mode.");
            return null;
        }

        return parseNumbersCsvLike(content);
    }

    private int[] parseNumbersJson(String content) {
        SimpleJsonParser parser = new SimpleJsonParser();
        Object parsed = parser.parse(content);
        if (!(parsed instanceof List<?> list)) {
            System.out.println("JSON must be an array of numbers.");
            return null;
        }
        int[] numbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i);
            try {
                if (item instanceof Number number) {
                    numbers[i] = number.intValue();
                } else {
                    numbers[i] = Integer.parseInt(String.valueOf(item).trim());
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number: " + item);
                return null;
            }
        }
        return numbers;
    }

    private int[] parseNumbersCsvLike(String content) {
        String[] parts = content.trim().split("[\\s,;]+");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            if (part.isBlank()) {
                continue;
            }
            try {
                numbers.add(Integer.parseInt(part.trim()));
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number: " + part);
                return null;
            }
        }
        int[] result = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }

    private PricingEngine.CustomerType readCustomerType() {
        String input = readLine("Customer type (REGULAR/VIP): ").trim().toUpperCase(Locale.ROOT);
        try {
            return PricingEngine.CustomerType.valueOf(input);
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid customer type.");
            return null;
        }
    }

    private String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private Integer readIntValue(String prompt) {
        String input = readLine(prompt).trim();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid integer.");
            return null;
        }
    }

    private Double readDoubleValue(String prompt) {
        String input = readLine(prompt).trim();
        try {
            return Double.valueOf(input);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number.");
            return null;
        }
    }

    private Boolean readBooleanValue(String prompt) {
        String input = readLine(prompt).trim().toLowerCase(Locale.ROOT);
        if ("true".equals(input)) {
            return true;
        }
        if ("false".equals(input)) {
            return false;
        }
        System.out.println("Expected true/false.");
        return null;
    }

    private String readFileContent(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException ex) {
            System.out.println("Failed to read file: " + ex.getMessage());
            return null;
        }
    }

    private List<String[]> parseCsvRows(String content) {
        List<String[]> rows = new ArrayList<>();
        String[] lines = content.split("\\R");
        for (String line : lines) {
            if (line.isBlank()) {
                continue;
            }
            rows.add(line.split("\\s*,\\s*"));
        }
        return rows;
    }
}

