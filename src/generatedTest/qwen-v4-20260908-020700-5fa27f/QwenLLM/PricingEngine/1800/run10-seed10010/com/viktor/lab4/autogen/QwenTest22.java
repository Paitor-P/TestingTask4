package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest22 {

    @Test(timeout = 1000)
    public void testCalculateFinalPriceRegularCustomerWithCoupon() {
        PricingEngine pricingEngine = new PricingEngine();
        PricingRequest request = new PricingRequest(
                49.99,
                3,
                CustomerType.REGULAR,
                true,
                "SAVE10",
                false,
                100
        );
        double expected = 118.97; // Corrected expected value
        double actual = pricingEngine.calculateFinalPrice(request);
        assertEquals(expected, actual, 0.01);
    }
}
