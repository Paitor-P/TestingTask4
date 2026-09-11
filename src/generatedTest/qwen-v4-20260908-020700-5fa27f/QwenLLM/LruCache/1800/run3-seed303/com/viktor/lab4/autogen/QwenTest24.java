package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest24 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, Integer> cache = new LruCache<>(2);
        assertSame(null, cache.get("key")); // Key not present, should return null
        assertFalse(cache.containsKey("key")); // Key not present, should return false
        assertEquals(0, cache.size()); // Size should be 0
    }
}
