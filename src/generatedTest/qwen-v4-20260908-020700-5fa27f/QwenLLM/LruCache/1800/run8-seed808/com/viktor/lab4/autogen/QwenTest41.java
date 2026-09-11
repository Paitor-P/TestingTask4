package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest41 {

    @Test(timeout=1000)
    public void testEmptyCache() {
        LruCache<Integer, Integer> cache = new LruCache<>(1);
        assertNull(cache.get(1));
        assertFalse(cache.containsKey(1));
        assertEquals(0, cache.size());
    }
}
