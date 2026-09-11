package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest23 {
    @Test(timeout = 1000)
    public void testParseSimpleNumber() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String input = "123.456";
        double expected = 123.456;
        double result = (Double) parser.parse(input);
        assertEquals(expected, result, 1e-9); // Allowing for floating-point precision issues
    }
}
