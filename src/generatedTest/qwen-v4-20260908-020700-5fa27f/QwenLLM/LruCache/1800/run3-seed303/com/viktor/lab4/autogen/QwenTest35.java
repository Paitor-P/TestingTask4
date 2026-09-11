package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class QwenTest35 {

    @Test(timeout = 1000)
    public void testLruCacheCapacity() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        
        // Add elements to the cache
        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);
        
        // Check the size of the cache
        assertEquals(3, cache.size());
        
        // Add another element to trigger eviction
        cache.put("D", 4);
        
        // Check the size of the cache after eviction
        assertEquals(3, cache.size());
        
        // Verify the order of elements
        assertEquals(4, cache.get("D").intValue());
        assertEquals(3, cache.get("C").intValue());
        assertEquals(2, cache.get("B").intValue());
    }
}
