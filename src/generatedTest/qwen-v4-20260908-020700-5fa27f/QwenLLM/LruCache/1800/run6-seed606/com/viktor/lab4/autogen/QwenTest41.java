package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;
import java.util.*;

public class QwenTest41 {

    @Test(timeout = 1000)
    public void testEmptyCache() {
        LruCache<Integer, String> cache = new LruCache<>(1);
        assertNull(cache.get(1)); // Check null for non-existent key
        assertTrue(cache.size() == 0); // Check size is 0
    }
}
