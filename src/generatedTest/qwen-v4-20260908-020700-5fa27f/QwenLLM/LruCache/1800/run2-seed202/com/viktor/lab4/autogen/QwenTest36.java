package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class QwenTest36 {

    @Test(timeout = 1000)
    public void testPutWithInvalidCapacity() {
        try {
            LruCache<String, Integer> cache = new LruCache<>(0);
            fail("Expected IllegalArgumentException when capacity is 0");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }
}
