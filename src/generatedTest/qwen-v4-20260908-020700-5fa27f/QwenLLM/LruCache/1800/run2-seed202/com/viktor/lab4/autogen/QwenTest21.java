package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest21 {

    @Test(timeout = 1000)
    public void testInvalidCapacity() {
        try {
            new LruCache(-1); // Should throw IllegalArgumentException
            fail("Expected IllegalArgumentException for negative capacity");
        } catch (IllegalArgumentException e) {
            assertEquals("capacity must be > 0", e.getMessage());
        }
    }
}
