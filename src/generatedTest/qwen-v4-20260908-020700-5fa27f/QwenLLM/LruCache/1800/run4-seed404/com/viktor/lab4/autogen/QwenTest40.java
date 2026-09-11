package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest40 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, Integer> cache = new LruCache<>(1);
        assertFalse(cache.containsKey("key"));
        assertEquals(0, cache.size());
        assertNull(cache.get("key"));
    }
}
