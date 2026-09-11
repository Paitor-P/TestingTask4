package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest6 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, Integer> cache = new LruCache<>(1);
        assertNull(cache.get("key"));
        assertFalse(cache.containsKey("key"));
        assertEquals(0, cache.size());
        cache.put("key", 1);
        assertEquals(1, cache.size());
        assertEquals(1, cache.get("key").intValue()); // Use intValue() to match the expected type
        assertFalse(cache.containsKey("nonexistent"));
        assertEquals(1, cache.size());
    }
}
