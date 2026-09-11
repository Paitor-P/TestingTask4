package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest18 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        assertEquals(0, cache.size());
        try {
            cache.get("key");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
        assertFalse(cache.containsKey("key"));
        cache.put("key", 42);
        assertEquals(1, cache.size());
        assertEquals(42, cache.get("key").intValue());
    }
}
