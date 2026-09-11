package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest1 {

    @Test(timeout = 1000)
    public void testSimplePutGet() {
        LruCache<Integer, String> cache = new LruCache<>(3);
        
        // Put some elements into the cache
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");
        
        // Check size of the cache
        assertEquals(3, cache.size());
        
        // Retrieve an element
        String value = cache.get(2);
        assertEquals("two", value);
        
        // Check size of the cache after get
        assertEquals(3, cache.size());
        
        // Check put operation with existing key
        cache.put(2, "twoUpdated");
        assertEquals("twoUpdated", cache.get(2));
        
        // Check size of the cache after put
        assertEquals(3, cache.size());
    }
}
