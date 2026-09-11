package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest45 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);

        // Ensure all entries are present
        assertTrue(cache.containsKey("one"));
        assertTrue(cache.containsKey("two"));
        assertTrue(cache.containsKey("three"));

        // Verify that 'one' is the least recently used
        cache.put("four", 4); // Evicts "one"
        assertFalse(cache.containsKey("one"));
        assertTrue(cache.containsKey("two"));
        assertTrue(cache.containsKey("three"));
        assertTrue(cache.containsKey("four"));
    }
}
