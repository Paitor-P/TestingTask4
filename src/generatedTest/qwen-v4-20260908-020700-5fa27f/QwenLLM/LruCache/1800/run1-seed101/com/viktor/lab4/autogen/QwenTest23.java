package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest23 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<Integer, String> cache = new LruCache<>(3);

        // Initial state
        assertFalse(cache.containsKey(1));
        assertEquals(0, cache.size());

        // Put and get
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");

        // Verify put and get
        assertTrue(cache.containsKey(1));
        assertEquals("one", cache.get(1));
        assertTrue(cache.containsKey(2));
        assertEquals("two", cache.get(2));
        assertTrue(cache.containsKey(3));
        assertEquals("three", cache.get(3));

        // Check size
        assertEquals(3, cache.size());

        // Check eviction
        cache.put(4, "four"); // Should evict 1
        assertFalse(cache.containsKey(1));
        assertTrue(cache.containsKey(2));
        assertTrue(cache.containsKey(3));
        assertTrue(cache.containsKey(4));
        assertEquals("four", cache.get(4));
        assertEquals(3, cache.size());
    }
}
