package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class QwenTest39 {

    @Test(timeout=1000)
    public void testZeroCapacity() {
        try {
            new LruCache<>(0); // This should throw an IllegalArgumentException
            fail("Expected IllegalArgumentException for zero capacity");
        } catch (IllegalArgumentException e) {
            // Expected exception
            assertEquals("capacity must be > 0", e.getMessage());
        }
    }
}
