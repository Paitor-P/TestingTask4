package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.SimpleJsonParser;

public class QwenTest7 {

    @Test(timeout=1000)
    public void testParseString() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String json = "\"Hello, World!\"";
        Object value = parser.parse(json);
        assertEquals("Hello, World!", value);
    }
}
