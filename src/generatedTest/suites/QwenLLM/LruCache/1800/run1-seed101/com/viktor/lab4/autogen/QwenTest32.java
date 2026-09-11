package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest32 {

    @Test(timeout = 1000)
    public void testPutGetContainsKeySize() {
        LruCache<Integer, String> lruCache = new LruCache<>(3);

        // Test put and get
        lruCache.put(1, "one");
        assertEquals("one", lruCache.get(1));
        assertTrue(lruCache.containsKey(1));
        assertEquals(1, lruCache.size());

        // Test put again and get
        lruCache.put(2, "two");
        assertEquals("two", lruCache.get(2));
        assertTrue(lruCache.containsKey(2));
        assertEquals(2, lruCache.size());

        // Test put and get with new key
        lruCache.put(3, "three");
        assertEquals("three", lruCache.get(3));
        assertTrue(lruCache.containsKey(3));
        assertEquals(3, lruCache.size());

        // Test put and get with replacing existing key
        lruCache.put(1, "one_modified");
        assertEquals("one_modified", lruCache.get(1));
        assertTrue(lruCache.containsKey(1));
        assertEquals(3, lruCache.size());

        // Test put and get with full capacity, new key should replace least recently used
        lruCache.put(4, "four");
        assertEquals("one_modified", lruCache.get(1)); // Should be replaced
        assertFalse(lruCache.containsKey(2));
        assertEquals(3, lruCache.size());

        // Test put and get with full capacity, existing key should not change
        lruCache.put(5, "five");
        assertEquals("one_modified", lruCache.get(1)); // Should not change
        assertTrue(lruCache.containsKey(1));
        assertEquals(3, lruCache.size());
    }
}
