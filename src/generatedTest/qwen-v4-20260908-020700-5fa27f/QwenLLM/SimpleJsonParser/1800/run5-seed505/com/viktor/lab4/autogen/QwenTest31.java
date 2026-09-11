package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest31 {

    @Test(timeout = 1000)
    public void testParseEmptyInput() {
        SimpleJsonParser parser = new SimpleJsonParser();
        try {
            parser.parse("");
        } catch (IllegalArgumentException e) {
            assertEquals("Unexpected end of input at position 0", e.getMessage());
        }
    }
}
