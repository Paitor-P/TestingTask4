package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest31 {

    @Test(timeout=1000)
    public void testSimpleCacheOperations() {
        LruCache<String, Integer> cache = new LruCache<>(2);
        
        // Put some initial values
        cache.put("a", 1);
        cache.put("b", 2);
        
        // Check size and containsKey
        assertEquals(2, cache.size());
        assertTrue(cache.containsKey("a"));
        assertTrue(cache.containsKey("b"));
        
        // Get existing values
        assertEquals(1, (int) cache.get("a"));
        assertEquals(2, (int) cache.get("b"));
        
        // Put a new value to evict the least recently used item
        cache.put("c", 3);
        
        // Check size and containsKey
        assertEquals(2, cache.size());
        assertFalse(cache.containsKey("a"));
        assertTrue(cache.containsKey("b"));
        assertTrue(cache.containsKey("c"));
        
        // Get the newly added value
        assertEquals(3, (int) cache.get("c"));
        
        // Put another value to ensure the least recently used item is evicted
        cache.put("d", 4);
        
        // Check size and containsKey
        assertEquals(2, cache.size());
        assertFalse(cache.containsKey("b"));
        assertTrue(cache.containsKey("c"));
        assertTrue(cache.containsKey("d"));
        
        // Get the newly added value
        assertEquals(4, (int) cache.get("d"));
    }
}
