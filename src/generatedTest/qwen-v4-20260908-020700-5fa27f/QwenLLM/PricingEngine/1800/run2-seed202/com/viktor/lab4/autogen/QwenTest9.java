package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest9 {

    @Test(timeout = 1000)
    public void testInvalidCustomerType() {
        PricingRequest request = new PricingRequest(100.0, 1, null, false, "SAVE10", false, 500);
        PricingEngine pricingEngine = new PricingEngine();
        try {
            pricingEngine.calculateFinalPrice(request);
            fail("Expected IllegalArgumentException for null customerType");
        } catch (IllegalArgumentException e) {
            assertEquals("customerType must not be null", e.getMessage());
        }
    }
}
