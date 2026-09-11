package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest4 {

    @Test(timeout = 1000)
    public void testInvalidInput() {
        try {
            new LongestIncreasingSubsequence().lengthOfLIS(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            assertEquals("numbers must not be null", e.getMessage());
        }
    }
}
