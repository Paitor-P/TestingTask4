package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest34 {

    @Test(timeout=1000)
    public void testCalculateFinalPrice() {
        PricingEngine pricingEngine = new PricingEngine();
        PricingRequest request = new PricingRequest(10.0, 5, PricingEngine.CustomerType.REGULAR, false, "SAVE10", false, 200);
        double result = pricingEngine.calculateFinalPrice(request);
        assertEquals(51.99, result, 0.01);
    }
}
