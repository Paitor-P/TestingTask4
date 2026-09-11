package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest54 {

    @Test(timeout = 1000)
    public void testCalculateFinalPrice() {
        PricingEngine pricingEngine = new PricingEngine();

        PricingRequest request = new PricingRequest(
                100.0, // basePrice
                5, // quantity
                PricingEngine.CustomerType.REGULAR, // customerType
                false, // seasonalSale
                "SAVE10", // couponCode
                false, // firstOrder
                500 // loyaltyPoints
        );

        double expected = 432.99; // Corrected expected value
        double actual = pricingEngine.calculateFinalPrice(request);

        assertEquals(expected, actual, 0.001);
    }
}
