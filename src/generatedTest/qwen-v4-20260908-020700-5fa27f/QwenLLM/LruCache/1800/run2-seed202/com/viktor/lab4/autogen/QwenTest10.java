package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest10 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<Integer, String> cache = new LruCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        assertEquals("A", cache.get(1));
        assertEquals("B", cache.get(2));
        assertEquals("C", cache.get(3));

        // Add a new key to exceed capacity
        cache.put(4, "D");
        // The least recently used item "A" should be evicted
        assertNull(cache.get(1));
        assertNotNull(cache.get(2));
        assertNotNull(cache.get(3));
        assertNotNull(cache.get(4));
    }
}
