package com.viktor.lab4.autogen;
import com.viktor.lab4.LruCache.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.viktor.lab4.LruCache;

public class QwenTest55 {

    @Test(timeout = 1000)
    public void testPutWithIllegalCapacity() {
        // Attempt to create a LruCache with a non-positive capacity
        assertThrows(IllegalArgumentException.class, () -> {
            new LruCache<>(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new LruCache<>(-1);
        });
    }
}
