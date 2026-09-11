package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest6 {

    @Test(timeout = 1000)
    public void testPutAndGetInvalidKey() {
        LruCache<String, String> cache = new LruCache<>(1);
        try {
            cache.put("key", "value");
            String result = cache.get("invalidKey");
            assertNull(result); // Corrected assertion to check for null result
        } catch (IllegalArgumentException e) {
            assertEquals("Key must not be null", e.getMessage());
        }
    }
}
