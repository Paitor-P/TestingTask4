package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest51 {

    @Test(timeout = 1000)
    public void testParseString() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String jsonString = "\"Hello, world!\"";
        Object parsedValue = parser.parse(jsonString);
        assertEquals("Hello, world!", parsedValue);
    }
}
