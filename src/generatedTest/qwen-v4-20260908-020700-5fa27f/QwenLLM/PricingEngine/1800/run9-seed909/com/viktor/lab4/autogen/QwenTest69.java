package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest69 {

    @Test(timeout=1000)
    public void testInvalidNullRequest() {
        PricingRequest request = null;
        PricingEngine engine = new PricingEngine();
        try {
            engine.calculateFinalPrice(request);
            fail("IllegalArgumentException expected for null request");
        } catch (IllegalArgumentException e) {
            assertEquals("request must not be null", e.getMessage());
        }
    }
}
