package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.PricingRequest;

public class QwenTest51 {

    @Test(timeout = 1000)
    public void testCalculateFinalPriceWithEmptyRequest() {
        PricingRequest request = new PricingRequest(0.0, 0, PricingEngine.CustomerType.REGULAR, false, null, false, 0);
        PricingEngine pricingEngine = new PricingEngine();
        try {
            pricingEngine.calculateFinalPrice(request);
        } catch (IllegalArgumentException e) {
            assertEquals("quantity must be > 0", e.getMessage());
        }
    }
}
