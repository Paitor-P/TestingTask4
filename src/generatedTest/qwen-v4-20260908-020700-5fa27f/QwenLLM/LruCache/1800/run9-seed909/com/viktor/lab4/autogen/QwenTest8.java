package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest8 {

    @Test(timeout = 1000)
    public void testEvictionAtCapacityThreshold() {
        LruCache<Integer, Integer> cache = new LruCache<>(3);
        
        // Add some entries to the cache
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        
        // Add a fourth entry to trigger eviction
        cache.put(4, 4);
        
        // Check that the oldest entry (1) has been evicted
        assertFalse(cache.containsKey(1));
        
        // Check that the remaining entries are still present
        assertTrue(cache.containsKey(2));
        assertTrue(cache.containsKey(3));
        assertTrue(cache.containsKey(4));
    }
}
