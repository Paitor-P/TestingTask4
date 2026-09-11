package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest53 {

    @Test(timeout = 1000)
    public void testGetAndPut() {
        LruCache<Integer, String> lruCache = new LruCache<>(3);
        
        // Put some items into the cache
        lruCache.put(1, "one");
        lruCache.put(2, "two");
        lruCache.put(3, "three");

        // Verify the size of the cache
        assertEquals(3, lruCache.size());

        // Check that the items are retrieved correctly
        assertEquals("one", lruCache.get(1));
        assertEquals("two", lruCache.get(2));
        assertEquals("three", lruCache.get(3));

        // Put a new item which will evict the least recently used item (1)
        lruCache.put(4, "four");

        // Verify the size of the cache and that 1 has been evicted
        assertEquals(3, lruCache.size());
        assertNull(lruCache.get(1));
    }
}
