package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import com.viktor.lab4.SimpleJsonParser;

public class QwenTest32 {

    @Test(timeout = 1000)
    public void testParseNumber() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String input = "123.456";
        Double result = (Double) parser.parse(input);
        assertEquals(123.456, result, 0.001);
    }
}
