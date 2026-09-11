package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.SimpleJsonParser;

public class QwenTest15 {

    @Test(timeout = 1000)
    public void testStringParsing() {
        SimpleJsonParser parser = new SimpleJsonParser();
        Object result = parser.parse("\"Hello, World!\"");

        assertEquals("Hello, World!", result);
    }
}
