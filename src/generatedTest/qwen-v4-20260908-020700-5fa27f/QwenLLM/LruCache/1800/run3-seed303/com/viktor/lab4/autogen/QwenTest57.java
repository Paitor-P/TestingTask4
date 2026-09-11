package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest57 {

    @Test(timeout = 1000)
    public void testSimpleLruCache() {
        LruCache<String, Integer> cache = new LruCache<>(3);

        // Add some initial entries
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);

        // Check that the cache size is as expected
        assertEquals(3, cache.size());

        // Access an existing entry
        Integer value = cache.get("B");
        assertNotNull(value);
        assertEquals(2, value.intValue());

        // Check that the cache size remains the same after access
        assertEquals(3, cache.size());

        // Add a new entry which will evict an existing entry
        cache.put("D", 4);

        // Check that the oldest entry has been removed
        assertFalse(cache.containsKey("A"));
        assertTrue(cache.containsKey("B"));
        assertTrue(cache.containsKey("C"));
        assertTrue(cache.containsKey("D"));
        assertEquals(3, cache.size());
    }
}
