package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.CustomerType;

public class QwenTest47 {

    @Test(timeout = 1000)
    public void testCalculateFinalPriceNormalCase() {
        PricingEngine pricingEngine = new PricingEngine();

        PricingRequest request = new PricingRequest(
                100.0,  // basePrice
                5,      // quantity
                CustomerType.REGULAR, // customerType
                false,    // seasonalSale
                "SAVE10", // couponCode
                true,     // firstOrder
                500      // loyaltyPoints
        );

        double expected = 407.99; // Expected value after calculations

        double result = pricingEngine.calculateFinalPrice(request);

        assertEquals(expected, result, 0.001);
    }
}
