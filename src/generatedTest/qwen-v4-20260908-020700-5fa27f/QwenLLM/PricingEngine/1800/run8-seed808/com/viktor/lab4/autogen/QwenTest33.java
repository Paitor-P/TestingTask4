package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest33 {

    @Test(timeout = 1000)
    public void testInvalidCustomerTypeThrowsIllegalArgumentException() {
        PricingRequest request = new PricingRequest(
                100.0,
                10,
                null,
                false,
                "SAVE10",
                true,
                500
        );

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            PricingEngine pricingEngine = new PricingEngine();
            pricingEngine.calculateFinalPrice(request);
        });

        assertEquals("customerType must not be null", thrown.getMessage());
    }
}
