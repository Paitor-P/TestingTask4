package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class QwenTest39 {

    @Test(timeout=1000)
    public void testInvalidNullInput() {
        SimpleJsonParser parser = new SimpleJsonParser();
        try {
            parser.parse(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            assertEquals("input must not be null", e.getMessage());
        }
    }
}
