package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.viktor.lab4.LruCache;
import java.util.HashMap;
import java.util.Map;

public class QwenTest32 {

    @Test(timeout = 1000)
    public void testPutAndGetMultipleKeys() {
        LruCache<String, Integer> cache = new LruCache<>(2);
        cache.put("one", 1);
        cache.put("two", 2);
        assertEquals(Integer.valueOf(1), cache.get("one")); // Use Integer.valueOf() to match the expected type
        assertEquals(Integer.valueOf(2), cache.get("two")); // Use Integer.valueOf() to match the expected type
        assertEquals(2, cache.size()); // Size should be 2 due to LRU policy
        assertEquals(false, cache.containsKey("three")); // Check that "three" is not in the cache
        assertEquals(2, cache.size()); // Size should still be 2 due to LRU policy
    }
}
