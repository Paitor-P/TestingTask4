package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest12 {

    @Test(timeout = 1000)
    public void testPutWithInvalidCapacity() {
        try {
            // Use a static inner class to access LruCache
            class InnerLruCache extends LruCache<String, Integer> {
                InnerLruCache(int capacity) {
                    super(capacity);
                }
            }

            new InnerLruCache(-1);
            fail("Expected IllegalArgumentException for non-positive capacity");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
