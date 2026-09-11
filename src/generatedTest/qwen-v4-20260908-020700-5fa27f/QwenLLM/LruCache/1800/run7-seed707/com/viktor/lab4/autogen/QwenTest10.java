package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest10 {

    @Test(timeout = 1000)
    public void testGet() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);

        assertEquals(1, (int) cache.get("one"));
        assertEquals(2, (int) cache.get("two"));
        assertEquals(3, (int) cache.get("three"));
        assertFalse(cache.containsKey("four"));

        // Ensure "one" is the least recently used and "three" is the most recently used
        assertEquals(1, (int) cache.get("one"));
        assertEquals(2, (int) cache.get("two"));
        assertEquals(3, (int) cache.get("three"));
    }
}
