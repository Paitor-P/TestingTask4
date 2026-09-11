package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest15 {

    @Test(timeout = 1000)
    public void testPutAndContainsKey() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);

        assertTrue(cache.containsKey("one"));
        assertTrue(cache.containsKey("two"));
        assertTrue(cache.containsKey("three"));

        assertFalse(cache.containsKey("four"));
    }
}
