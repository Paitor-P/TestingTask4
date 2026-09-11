package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest11 {

    @Test(timeout = 1000)
    public void testGetWithExistingKey() {
        LruCache<String, Integer> cache = new LruCache<>(2);
        cache.put("key1", 1);
        cache.put("key2", 2);

        assertEquals(1, (int) cache.get("key1"));
        assertEquals(2, (int) cache.get("key2"));
    }
}
