package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest18 {

    @Test(timeout = 1000)
    public void testLruCacheWithInvalidCapacity() {
        try {
            LruCache<String, Integer> cache = new LruCache<>(0);
            fail("Expected IllegalArgumentException for invalid capacity");
        } catch (IllegalArgumentException e) {
            assertEquals("capacity must be > 0", e.getMessage());
        }
    }
}
