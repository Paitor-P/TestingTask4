package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest14 {

    @Test(timeout=1000)
    public void testNegativeArray() {
        try {
            LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
            lis.lengthOfLIS(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            assertEquals("numbers must not be null", e.getMessage());
        }
    }
}
