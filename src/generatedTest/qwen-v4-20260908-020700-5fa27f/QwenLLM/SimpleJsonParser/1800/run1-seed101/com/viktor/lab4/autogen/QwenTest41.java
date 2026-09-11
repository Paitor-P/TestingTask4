package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest41 {

    @Test(timeout=1000)
    public void testParseNumber() {
        SimpleJsonParser parser = new SimpleJsonParser();
        String input = "123.456";
        Object result = parser.parse(input);
        assertEquals(123.456, (double) result, 1e-9); // Cast to double to match the expected type
    }
}
