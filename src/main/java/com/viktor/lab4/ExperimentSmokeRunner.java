package com.viktor.lab4;

import java.util.List;

public class ExperimentSmokeRunner {

    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int lisLength = lis.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});

        LruCache<String, Integer> cache = new LruCache<>(2);
        cache.put("a", 1);
        cache.put("b", 2);
        cache.get("a");
        cache.put("c", 3);

        SimpleJsonParser parser = new SimpleJsonParser();
        Object json = parser.parse("[1, \"x\", [2, 3]]");

        PricingEngine pricingEngine = new PricingEngine();
        double price = pricingEngine.calculateFinalPrice(new PricingEngine.PricingRequest(
                12.5,
                12,
                PricingEngine.CustomerType.VIP,
                true,
                "SAVE10",
                false,
                320
        ));

        System.out.println("LIS=" + lisLength);
        System.out.println("Cache contains b? " + cache.containsKey("b"));
        System.out.println("Parsed JSON type=" + json.getClass().getSimpleName());
        System.out.println("Final price=" + price);
        System.out.println("Array size=" + ((List<?>) json).size());
    }
}

