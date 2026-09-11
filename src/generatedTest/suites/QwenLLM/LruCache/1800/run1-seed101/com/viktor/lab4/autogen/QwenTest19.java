package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest19 {

    @Test(timeout = 1000)
    public void testLruCache() {
        LruCache<String, Integer> lruCache = new LruCache<>(3);

        // Test basic put and get operations
        lruCache.put("one", 1);
        lruCache.put("two", 2);
        lruCache.put("three", 3);
        assertEquals(1, lruCache.get("one").intValue());
        assertEquals(2, lruCache.get("two").intValue());
        assertEquals(3, lruCache.get("three").intValue());

        // Test adding more elements than capacity
        lruCache.put("four", 4);
        assertEquals(4, lruCache.get("four").intValue());
        assertNull(lruCache.get("one")); // "one" is evicted

        // Test containsKey and size
        assertTrue(lruCache.containsKey("two"));
        assertFalse(lruCache.containsKey("one"));
        assertEquals(3, lruCache.size());

        // Test get on non-existent key
        assertNull(lruCache.get("five"));

        // Test put on already existing key
        lruCache.put("two", 20);
        assertEquals(20, lruCache.get("two").intValue());
    }
}
