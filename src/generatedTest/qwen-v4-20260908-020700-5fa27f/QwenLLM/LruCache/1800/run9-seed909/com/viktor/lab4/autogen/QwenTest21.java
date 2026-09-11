package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest21 {

    @Test(timeout=1000)
    public void testCachePutGet() {
        LruCache<String, String> cache = new LruCache<>(2);
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        assertEquals("value1", cache.get("key1"));
        assertEquals("value2", cache.get("key2"));
        assertEquals(2, cache.size());
        cache.put("key3", "value3");
        assertNull(cache.get("key1"));
        assertEquals("value3", cache.get("key3"));
        assertEquals(2, cache.size());
    }
}
