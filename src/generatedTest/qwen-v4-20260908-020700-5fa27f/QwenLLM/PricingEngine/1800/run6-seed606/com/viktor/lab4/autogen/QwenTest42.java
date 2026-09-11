package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest42 {

    @Test(timeout = 1000)
    public void testCalculateFinalPriceWithThreshold() {
        PricingRequest request = new PricingRequest(
                49.99, 10, PricingEngine.CustomerType.REGULAR, false, "SAVE10", false, 0
        );
        PricingEngine engine = new PricingEngine(); // Create an instance of PricingEngine
        double expected = 49.99 * 10 * (1.0 - 0.15 - 0.05) + 7.99;
        assertEquals(expected, engine.calculateFinalPrice(request), 0.01);
    }
}
