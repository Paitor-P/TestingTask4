package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest28 {

    @Test(timeout = 1000)
    public void testInvalidCapacity() {
        try {
            new LruCache<>(0);
            fail("Expected IllegalArgumentException for capacity <= 0");
        } catch (IllegalArgumentException e) {
            assertEquals("capacity must be > 0", e.getMessage());
        }
    }
}
