package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest31 {

    @Test(timeout = 1000)
    public void testGetAndPut() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        assertEquals(0, cache.size());

        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);
        assertEquals(3, cache.size());

        assertEquals(1, (int) cache.get("one"));
        assertEquals(2, (int) cache.get("two"));
        assertEquals(3, (int) cache.get("three"));

        cache.put("four", 4); // Evicts "one"
        assertEquals(3, cache.size());
        assertNull(cache.get("one"));
        assertEquals(2, (int) cache.get("two"));
        assertEquals(3, (int) cache.get("three"));
        assertEquals(4, (int) cache.get("four"));

        cache.put("five", 5); // Evicts "two"
        assertEquals(3, cache.size());
        assertNull(cache.get("two"));
        assertEquals(3, (int) cache.get("three"));
        assertEquals(4, (int) cache.get("four"));
        assertEquals(5, (int) cache.get("five"));
    }
}
