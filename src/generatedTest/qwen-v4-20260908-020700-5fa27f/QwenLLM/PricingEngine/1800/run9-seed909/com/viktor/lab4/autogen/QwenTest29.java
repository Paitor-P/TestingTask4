package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest29 {

    @Test(timeout = 1000)
    public void testInvalidNullRequest() {
        PricingEngine pricingEngine = new PricingEngine();
        PricingRequest nullRequest = null;
        try {
            pricingEngine.calculateFinalPrice(nullRequest);
            fail("Expected IllegalArgumentException for null request");
        } catch (IllegalArgumentException e) {
            assertEquals("request must not be null", e.getMessage());
        }
    }
}
