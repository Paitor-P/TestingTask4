package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest20 {

    @Test(timeout = 1000)
    public void testCacheWithThresholdCondition() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        cache.put("D", 4); // This will cause "A" to be evicted

        // Check that "A" is not in the cache
        assertFalse(cache.containsKey("A"));

        // Check that "B" and "C" are still in the cache
        assertTrue(cache.containsKey("B"));
        assertTrue(cache.containsKey("C"));

        // Check that "D" is in the cache
        assertTrue(cache.containsKey("D"));
    }
}
