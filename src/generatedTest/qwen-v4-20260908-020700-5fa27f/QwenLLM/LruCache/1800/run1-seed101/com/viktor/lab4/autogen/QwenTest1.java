package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest1 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<Integer, String> cache = new LruCache<>(3);
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        // Initially, all keys should be present and in the correct order
        assertTrue(cache.containsKey(1));
        assertTrue(cache.containsKey(2));
        assertTrue(cache.containsKey(3));

        assertEquals("One", cache.get(1));
        assertEquals("Two", cache.get(2));
        assertEquals("Three", cache.get(3));

        // Adding a fourth key should remove the least recently used key (1)
        cache.put(4, "Four");

        // 1 should no longer be in the cache
        assertFalse(cache.containsKey(1));
        // 2 should still be in the cache
        assertTrue(cache.containsKey(2));
        // 3 should still be in the cache
        assertTrue(cache.containsKey(3));
        // 4 should be in the cache
        assertTrue(cache.containsKey(4));
    }
}
