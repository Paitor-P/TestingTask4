package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest46 {

    @Test(timeout = 1000)
    public void testParseSimpleString() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String input = "\"Hello, World!\"";
        Object result = parser.parse(input);
        assertEquals("Hello, World!", result);
    }
}
