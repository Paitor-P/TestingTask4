package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.viktor.lab4.LruCache;
import java.util.Map;

public class QwenTest32 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, String> cache = new LruCache<>(1);
        assertNull(cache.get("key"));
        assertFalse(cache.containsKey("key"));
        assertEquals(0, cache.size());
    }
}
