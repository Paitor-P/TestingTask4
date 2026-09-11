package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest7 {

    @Test(timeout = 1000)
    public void testCalculateFinalPriceWithZeroQuantity() {
        PricingRequest request = new PricingRequest(
                10.0,  // basePrice
                0,      // quantity (invalid value, should cause an exception)
                CustomerType.REGULAR, // customerType
                false,    // seasonalSale
                "",       // couponCode
                false,    // firstOrder
                0         // loyaltyPoints
        );

        PricingEngine pricingEngine = new PricingEngine();
        try {
            pricingEngine.calculateFinalPrice(request);
            fail("Expected IllegalArgumentException for zero quantity");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
