package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest26 {

    @Test(timeout = 1000)
    public void testLruCacheBasicOperations() {
        LruCache<Integer, String> cache = new LruCache<>(3);

        // Put some elements into the cache
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");

        // Check that the size is correct
        assertEquals(3, cache.size());

        // Retrieve elements and check their values
        assertEquals("one", cache.get(1));
        assertEquals("two", cache.get(2));
        assertEquals("three", cache.get(3));

        // Put a new element that evicts the least recently used element
        cache.put(4, "four");

        // Check that the size is correct and that the least recently used element was evicted
        assertEquals(3, cache.size());
        assertNull(cache.get(1));

        // Check that the new element was added
        assertEquals("four", cache.get(4));
    }
}
