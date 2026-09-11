package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.viktor.lab4.LruCache;

public class QwenTest16 {

    @Test(timeout = 1000)
    public void testBasicOperations() {
        LruCache<Integer, String> cache = new LruCache<>(3);

        // Add items to the cache
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");

        // Get items from the cache
        assertEquals("one", cache.get(1));
        assertEquals("two", cache.get(2));
        assertEquals("three", cache.get(3));

        // Check size and containsKey
        assertEquals(3, cache.size());
        assertTrue(cache.containsKey(1));
        assertTrue(cache.containsKey(2));
        assertTrue(cache.containsKey(3));

        // Add an item to exceed capacity, which should evict the least recently used item
        cache.put(4, "four");
        assertEquals(3, cache.size());
        assertFalse(cache.containsKey(1));
        assertTrue(cache.containsKey(2));
        assertTrue(cache.containsKey(3));
        assertTrue(cache.containsKey(4));
    }
}
