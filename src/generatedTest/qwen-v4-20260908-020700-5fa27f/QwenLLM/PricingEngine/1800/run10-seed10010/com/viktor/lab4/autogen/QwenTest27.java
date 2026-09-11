package com.viktor.lab4.autogen;
import com.viktor.lab4.PricingEngine.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.PricingEngine;

public class QwenTest27 {

    @Test(timeout = 1000)
    public void testInvalidNullRequest() {
        PricingEngine engine = new PricingEngine();
        assertThrows(IllegalArgumentException.class, () -> engine.calculateFinalPrice(null));
    }
}
