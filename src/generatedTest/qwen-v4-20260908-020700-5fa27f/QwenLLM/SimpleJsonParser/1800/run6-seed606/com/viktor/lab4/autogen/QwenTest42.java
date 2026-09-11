package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.SimpleJsonParser;

public class QwenTest42 {

    @Test(timeout = 1000)
    public void testParseSingleNumber() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String input = "123.45";
        double expected = 123.45;
        try {
            Object result = parser.parse(input);
            assertEquals(expected, (double) result, 0.0001);
        } catch (IllegalArgumentException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}
