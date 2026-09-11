package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest29 {

    @Test(timeout = 1000)
    public void testParseNumberBelowThreshold() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String input = "123.45";
        double expected = 123.45;
        double result = (Double) parser.parse(input);
        assertEquals(expected, result, 0.00001); // Allowing a small margin for floating-point comparison
    }
}
