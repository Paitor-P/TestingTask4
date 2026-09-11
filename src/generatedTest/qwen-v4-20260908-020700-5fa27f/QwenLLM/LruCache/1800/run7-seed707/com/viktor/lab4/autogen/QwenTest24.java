package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashMap;

public class QwenTest24 {

    @Test(timeout = 1000)
    public void testGetAndPut() {
        LruCache<Integer, String> cache = new LruCache<>(3);
        cache.put(1, "one");
        cache.put(2, "two");
        cache.put(3, "three");

        // Check initial state
        assertEquals(3, cache.size());
        assertTrue(cache.containsKey(1));
        assertTrue(cache.containsKey(2));
        assertTrue(cache.containsKey(3));

        // Get and check value
        String value = cache.get(2);
        assertEquals("two", value);

        // Check size after get
        assertEquals(3, cache.size());

        // Put new key-value pair and check evict
        cache.put(4, "four");
        assertTrue(!cache.containsKey(1));
        assertEquals(3, cache.size());
    }
}
