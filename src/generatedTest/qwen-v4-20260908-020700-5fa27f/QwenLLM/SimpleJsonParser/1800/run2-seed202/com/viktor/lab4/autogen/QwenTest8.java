package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest8 {

    @Test(timeout = 1000)
    public void testParseWithNullInput() {
        SimpleJsonParser parser = new SimpleJsonParser(); // Create an instance of SimpleJsonParser
        try {
            parser.parse(null); // Call the parse method on the instance
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            assertEquals("input must not be null", e.getMessage());
        }
    }
}
