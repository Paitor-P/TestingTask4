package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest13 {

    @Test(timeout = 1000)
    public void testNormalCase() {
        LruCache<String, String> cache = new LruCache<>(3);
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");

        // Check size and containsKey
        assertEquals(3, cache.size());
        assertTrue(cache.containsKey("key1"));
        assertTrue(cache.containsKey("key2"));
        assertTrue(cache.containsKey("key3"));

        // Accessing key1 should not affect size or containsKey
        cache.get("key1");
        assertEquals(3, cache.size());
        assertTrue(cache.containsKey("key1"));
        assertTrue(cache.containsKey("key2"));
        assertTrue(cache.containsKey("key3"));

        // Accessing key2 should not affect size or containsKey
        cache.get("key2");
        assertEquals(3, cache.size());
        assertTrue(cache.containsKey("key1"));
        assertTrue(cache.containsKey("key2"));
        assertTrue(cache.containsKey("key3"));

        // Accessing key3 should not affect size or containsKey
        cache.get("key3");
        assertEquals(3, cache.size());
        assertTrue(cache.containsKey("key1"));
        assertTrue(cache.containsKey("key2"));
        assertTrue(cache.containsKey("key3"));

        // Add a new key to exceed capacity
        cache.put("key4", "value4");

        // Check size and containsKey
        assertEquals(3, cache.size());
        assertFalse(cache.containsKey("key1"));
        assertTrue(cache.containsKey("key2"));
        assertTrue(cache.containsKey("key3"));
        assertTrue(cache.containsKey("key4"));
    }
}
