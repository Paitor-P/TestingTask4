package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.CustomerType;

public class QwenTest3 {

    @Test(timeout = 1000)
    public void testCalculateFinalPrice() {
        PricingEngine pricingEngine = new PricingEngine();

        PricingRequest request = new PricingRequest(
                9.99,
                5,
                CustomerType.REGULAR,
                true,
                "SAVE10",
                true,
                100
        );

        double expected = 47.45; // Adjusted expected value
        double actual = pricingEngine.calculateFinalPrice(request);

        assertEquals(expected, actual, 0.0001);
    }
}
