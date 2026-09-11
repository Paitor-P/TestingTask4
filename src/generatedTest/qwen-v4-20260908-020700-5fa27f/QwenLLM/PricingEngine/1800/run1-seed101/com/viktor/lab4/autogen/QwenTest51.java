package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest51 {

    @Test(timeout = 1000)
    public void testCalculateFinalPriceWithInvalidInput() {
        PricingEngine pricingEngine = new PricingEngine();
        PricingRequest request = new PricingRequest(
                -1.0, // basePrice
                5, // quantity
                PricingEngine.CustomerType.REGULAR, // customerType
                true, // seasonalSale
                "SAVE10", // couponCode
                true, // firstOrder
                500 // loyaltyPoints
        );

        try {
            pricingEngine.calculateFinalPrice(request);
            fail("Expected IllegalArgumentException for null basePrice");
        } catch (IllegalArgumentException e) {
            assertEquals("basePrice must be >= 0", e.getMessage());
        }
    }
}
