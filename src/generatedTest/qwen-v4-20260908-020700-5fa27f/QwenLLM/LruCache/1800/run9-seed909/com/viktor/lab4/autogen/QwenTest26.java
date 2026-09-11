package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;
import java.util.LinkedHashMap;

public class QwenTest26 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<String, Integer> cache = new LruCache<>(5);
        assertNull(cache.get("key"));
        assertEquals(0, cache.size());
    }
}
