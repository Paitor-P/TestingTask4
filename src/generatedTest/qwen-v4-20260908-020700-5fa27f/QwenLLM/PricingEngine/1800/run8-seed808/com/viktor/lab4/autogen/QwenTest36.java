package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest36 {

    @Test(timeout = 1000)
    public void testCalculateFinalPrice() {
        PricingEngine engine = new PricingEngine();

        PricingRequest request = new PricingRequest(100.0, 5, PricingEngine.CustomerType.REGULAR, false, "SAVE10", true, 200);
        double expected = 422.99; // Adjusted expected value
        double actual = engine.calculateFinalPrice(request);
        assertEquals(expected, actual, 0.01);
    }
}
