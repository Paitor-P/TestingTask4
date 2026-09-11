package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.SimpleJsonParser;

public class QwenTest64 {

    @Test(timeout = 1000)
    public void testInvalidNullInput() {
        try {
            SimpleJsonParser parser = new SimpleJsonParser();
            parser.parse(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            assertEquals("input must not be null", e.getMessage());
        }
    }
}
