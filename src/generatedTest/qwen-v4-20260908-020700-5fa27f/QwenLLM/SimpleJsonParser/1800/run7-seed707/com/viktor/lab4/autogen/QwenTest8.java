package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest8 {

    @Test(timeout = 1000)
    public void testSimpleParse() {
        SimpleJsonParser parser = new SimpleJsonParser();
        Object result = parser.parse("\"hello\"");
        assertEquals("hello", result);
    }
}
