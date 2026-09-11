package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LruCache;

public class QwenTest9 {

    @Test(timeout = 1000)
    public void testPutInvalidCapacity() {
        try {
            new LruCache(-1);
            fail("Should throw IllegalArgumentException for negative capacity");
        } catch (IllegalArgumentException e) {
            assertEquals("capacity must be > 0", e.getMessage());
        }
    }
}
