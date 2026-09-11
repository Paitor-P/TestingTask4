package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest19 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        cache.put("a", 1);
        cache.put("b", 2);
        cache.put("c", 3);

        assertEquals(1, cache.get("a").intValue());
        assertEquals(2, cache.get("b").intValue());
        assertEquals(3, cache.get("c").intValue());

        // Add a new key to exceed capacity
        cache.put("d", 4);

        // 'a' should be evicted
        assertNull(cache.get("a"));
        assertNotNull(cache.get("b"));
        assertNotNull(cache.get("c"));
        assertNotNull(cache.get("d"));

        // Verify size
        assertEquals(3, cache.size());
    }
}
