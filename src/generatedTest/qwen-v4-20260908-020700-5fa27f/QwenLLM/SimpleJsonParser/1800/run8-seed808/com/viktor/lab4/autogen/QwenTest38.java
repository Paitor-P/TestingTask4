package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class QwenTest38 {
    @Test(timeout=1000)
    public void testParseEmptyArray() {
        SimpleJsonParser parser = new SimpleJsonParser();
        try {
            Object result = parser.parse("[]");
            assertEquals(new ArrayList<>(), result);
        } catch (IllegalArgumentException e) {
            fail("Unexpected exception");
        }
    }
}
