package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedHashMap;

public class QwenTest48 {

    @Test(timeout = 1000)
    public void testPutSingleEntry() {
        LruCache<Integer, Integer> cache = new LruCache<>(1);
        cache.put(1, 10);
        assertEquals(10, cache.get(1).intValue()); // Fixed assertion to match the type of cache.get(1)
        assertTrue(cache.containsKey(1));
        assertEquals(1, cache.size());
    }
}
