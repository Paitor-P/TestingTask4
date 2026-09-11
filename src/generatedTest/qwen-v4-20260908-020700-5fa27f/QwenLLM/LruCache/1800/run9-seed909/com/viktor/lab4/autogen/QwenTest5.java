package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest5 {

    @Test(timeout=1000)
    public void testEmptyCache() {
        LruCache<String, Integer> cache = new LruCache<>(1);
        assertNull(cache.get("testKey"));
        assertFalse(cache.containsKey("testKey"));
        assertEquals(0, cache.size());
    }
}
