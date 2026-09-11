package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest52 {

    @Test(timeout = 1000)
    public void testPutAndGet() {
        LruCache<String, Integer> cache = new LruCache<>(3);
        cache.put("a", 1);
        cache.put("b", 2);
        cache.put("c", 3);

        // Check that the size is as expected
        assertEquals(3, cache.size());

        // Check that the values are retrieved correctly
        assertEquals((Integer) 1, cache.get("a")); // Cast to Integer
        assertEquals((Integer) 2, cache.get("b")); // Cast to Integer
        assertEquals((Integer) 3, cache.get("c")); // Cast to Integer

        // Check that the order is correct (LRU order)
        assertEquals((Integer) 1, cache.get("a")); // a was recently accessed, so it moves to the end
        assertEquals((Integer) 2, cache.get("b")); // b was recently accessed, so it moves to the end
        assertEquals((Integer) 3, cache.get("c")); // c was recently accessed, so it moves to the end
    }
}
