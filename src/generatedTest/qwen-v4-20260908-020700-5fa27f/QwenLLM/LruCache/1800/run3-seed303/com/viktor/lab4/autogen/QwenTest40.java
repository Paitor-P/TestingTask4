package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

public class QwenTest40 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, String> cache = new LruCache<>(1);

        // Check initial size
        assertEquals("Cache should be empty", 0, cache.size());

        // Check get on empty cache
        assertNull("Get should return null for empty cache", cache.get("key"));

        // Check put on empty cache
        cache.put("key", "value");
        assertEquals("Cache size should be 1 after put", 1, cache.size());
        assertEquals("Get should return the value after put", "value", cache.get("key"));

        // Check containsKey on empty cache
        assertTrue("ContainsKey should return true for non-empty cache", cache.containsKey("key"));
        assertFalse("ContainsKey should return false for empty cache", cache.containsKey("nonKey"));
    }
}
