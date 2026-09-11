package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest27 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, String> cache = new LruCache<>(10);
        assertEquals(0, cache.size());
        assertFalse(cache.containsKey("test"));
        assertNull(cache.get("test"));
    }
}
