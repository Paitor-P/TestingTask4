package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest14 {

    @Test(timeout=1000)
    public void testEmptyCache() {
        LruCache<String, Integer> cache = new LruCache<>(2);
        assertNull(cache.get("test")); // Key not present, should return null
        assertFalse(cache.containsKey("test")); // Key not present, should return false
        assertEquals(0, cache.size()); // Cache should be empty, size should be 0
    }
}
