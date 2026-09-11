package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest64 {

    @Test(timeout = 1000)
    public void testCalculateFinalPrice() {
        PricingEngine engine = new PricingEngine();
        PricingRequest request = new PricingRequest(
                50.0, 3, PricingEngine.CustomerType.REGULAR, false, "SAVE10", true, 120
        );

        double expected = 133.99;
        double actual = engine.calculateFinalPrice(request);

        assertEquals(expected, actual, 0.001); // Adjusted tolerance slightly to handle floating-point arithmetic issues
    }
}
