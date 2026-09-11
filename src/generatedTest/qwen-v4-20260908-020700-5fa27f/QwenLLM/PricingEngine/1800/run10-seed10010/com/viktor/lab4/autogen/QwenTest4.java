package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest4 {

    @Test(timeout = 1000)
    public void testEmptyRequest() {
        PricingEngine pricingEngine = new PricingEngine();
        PricingRequest request = new PricingRequest(0.0, 0, PricingEngine.CustomerType.REGULAR, false, "", false, 0);
        try {
            double result = pricingEngine.calculateFinalPrice(request);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
