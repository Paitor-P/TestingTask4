package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest14 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<String, Integer> cache = new LruCache<>(2);
        cache.put("one", 1);
        cache.put("two", 2);
        assertEquals(2, cache.size());

        assertEquals(1, (int) cache.get("one")); // Cast to Integer
        assertEquals(2, (int) cache.get("two")); // Cast to Integer
        assertEquals(2, cache.size());

        cache.put("three", 3);
        assertNull(cache.get("one"));
        assertEquals(2, cache.size());
        assertEquals(3, (int) cache.get("three")); // Cast to Integer
        assertEquals(2, cache.size());
    }
}
