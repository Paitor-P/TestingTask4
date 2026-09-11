package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest33 {

    @Test(timeout = 1000)
    public void testLruCacheWithInvalidCapacity() {
        try {
            new LruCache(-1);
            fail("IllegalArgumentException should be thrown for capacity <= 0");
        } catch (IllegalArgumentException e) {
            // Expected exception is thrown
        }
    }
}
