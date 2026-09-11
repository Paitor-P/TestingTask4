package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest50 {

    @Test(timeout = 1000)
    public void testInvalidNullInput() {
        try {
            new SimpleJsonParser().parse(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            assertEquals("input must not be null", e.getMessage());
        }
    }
}
