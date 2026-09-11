package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest45 {

    @Test(timeout = 1000)
    public void testCalculateFinalPriceWithBoundaryCase() {
        PricingEngine pricingEngine = new PricingEngine();

        PricingRequest request = new PricingRequest(0.0, 1, PricingEngine.CustomerType.REGULAR, false, null, false, 0);

        double expected = 7.99; // Corrected expected value
        double actual = pricingEngine.calculateFinalPrice(request);

        assertEquals(expected, actual, 0.001);
    }
}
