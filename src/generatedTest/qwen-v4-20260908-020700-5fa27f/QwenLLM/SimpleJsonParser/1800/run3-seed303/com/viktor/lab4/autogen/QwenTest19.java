package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.SimpleJsonParser;

public class QwenTest19 {

    @Test(timeout = 1000)
    public void testParseSimpleString() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String input = "\"hello\"";
        Object result = parser.parse(input);
        assertEquals("hello", result);
    }
}
