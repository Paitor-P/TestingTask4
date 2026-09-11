package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.viktor.lab4.LruCache;

public class QwenTest43 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<String, Integer> cache = new LruCache<>(3);

        // Put some items into the cache
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);

        // Check that the cache contains the items and get them
        assertTrue(cache.containsKey("A"));
        assertTrue(cache.containsKey("B"));
        assertTrue(cache.containsKey("C"));
        assertEquals(1, cache.get("A").intValue()); // Use intValue() to match the expected type
        assertEquals(2, cache.get("B").intValue()); // Use intValue() to match the expected type
        assertEquals(3, cache.get("C").intValue()); // Use intValue() to match the expected type

        // Add a new item, which should evict the least recently used item
        cache.put("D", 4);
        assertFalse(cache.containsKey("A"));
        assertTrue(cache.containsKey("B"));
        assertTrue(cache.containsKey("C"));
        assertTrue(cache.containsKey("D"));
        assertEquals(2, cache.get("B").intValue()); // Use intValue() to match the expected type
        assertEquals(3, cache.get("C").intValue()); // Use intValue() to match the expected type
        assertEquals(4, cache.get("D").intValue()); // Use intValue() to match the expected type

        // Verify that the size of the cache is correct
        assertEquals(3, cache.size());
    }
}
