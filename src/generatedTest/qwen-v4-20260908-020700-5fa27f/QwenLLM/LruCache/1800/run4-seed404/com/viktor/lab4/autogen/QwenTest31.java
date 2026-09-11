package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest31 {

    @Test(timeout = 1000)
    public void testLruCacheContainsKeyAtCapacity() {
        LruCache<Integer, String> cache = new LruCache<>(2);
        cache.put(1, "one");
        cache.put(2, "two");
        assertTrue(cache.containsKey(1));
        assertFalse(cache.containsKey(3));
    }
}
