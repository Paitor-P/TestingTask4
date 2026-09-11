package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.PricingRequest;

public class QwenTest29 {

    @Test(timeout=1000)
    public void testInvalidInputNullRequest() {
        PricingEngine pricingEngine = new PricingEngine();
        PricingRequest request = null;

        try {
            pricingEngine.calculateFinalPrice(request);
            fail("Expected IllegalArgumentException for null request");
        } catch (IllegalArgumentException e) {
            assertEquals("request must not be null", e.getMessage());
        }
    }
}
