package com.viktor.lab4.autogen;
import com.viktor.lab4.SimpleJsonParser;
import com.viktor.lab4.SimpleJsonParser.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest34 {

    @Test(timeout = 1000)
    public void testParseSimpleNumber() {
        String input = "123.45";
        SimpleJsonParser parser = new SimpleJsonParser();
        Double result = (Double) parser.parse(input);
        assertEquals(123.45, result, 0.001);
    }
}
