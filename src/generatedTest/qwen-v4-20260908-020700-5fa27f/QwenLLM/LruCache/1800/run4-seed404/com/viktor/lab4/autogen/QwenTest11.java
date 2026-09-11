package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest11 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<String, Integer> cache = new LruCache<>(3);

        cache.put("A", 1);
        cache.put("B", 2);
        cache.put("C", 3);

        assertEquals(3, cache.size());

        assertEquals(1, (int) cache.get("A"));
        assertEquals(2, (int) cache.get("B"));
        assertEquals(3, (int) cache.get("C"));

        // Put a new key to exceed capacity
        cache.put("D", 4);

        // "A" should be evicted as it is the least recently used
        assertNull(cache.get("A"));

        assertEquals(3, cache.size());

        // "B" should be least recently used after "C" is evicted
        assertEquals(2, (int) cache.get("B"));
        assertEquals(3, (int) cache.get("C"));
        assertEquals(4, (int) cache.get("D"));
    }
}
