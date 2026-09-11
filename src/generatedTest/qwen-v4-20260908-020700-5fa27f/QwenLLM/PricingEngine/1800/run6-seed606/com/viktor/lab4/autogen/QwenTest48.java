package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest48 {

    @Test(timeout = 1000)
    public void testCalculateFinalPrice() {
        PricingRequest request = new PricingRequest(
                100.0,  // basePrice
                15,     // quantity
                CustomerType.REGULAR,
                false,
                "SAVE10",
                true,
                50
        );

        PricingEngine engine = new PricingEngine();
        double expected = engine.calculateFinalPrice(request);
        assertEquals(expected, expected, 0.001);
    }
}
