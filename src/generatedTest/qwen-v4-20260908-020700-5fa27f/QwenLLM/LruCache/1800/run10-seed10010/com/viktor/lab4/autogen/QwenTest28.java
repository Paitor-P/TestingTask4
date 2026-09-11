package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest28 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<String, Integer> cache = new LruCache<>(2);
        
        // Put two entries
        cache.put("one", 1);
        cache.put("two", 2);
        
        // Check size and content
        assertEquals(2, cache.size());
        assertEquals(1, (int) cache.get("one"));
        assertEquals(2, (int) cache.get("two"));
        
        // Put another entry, evicting "one"
        cache.put("three", 3);
        
        // Check size and content
        assertEquals(2, cache.size());
        assertNull(cache.get("one"));
        assertEquals(3, (int) cache.get("three"));
    }
}
