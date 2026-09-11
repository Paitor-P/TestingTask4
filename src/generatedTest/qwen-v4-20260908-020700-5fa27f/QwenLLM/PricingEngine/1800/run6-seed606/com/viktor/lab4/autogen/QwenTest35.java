package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest35 {

    @Test(timeout = 1000)
    public void testInvalidRequest() {
        PricingEngine pricingEngine = new PricingEngine();
        PricingRequest request = new PricingRequest(
                -1.0, 10, CustomerType.REGULAR, true, "SAVE10", true, 500
        );

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            pricingEngine.calculateFinalPrice(request);
        });

        assertEquals("basePrice must be >= 0", e.getMessage());
    }
}
