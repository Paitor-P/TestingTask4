package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest15 {

    @Test(timeout = 1000)
    public void testInvalidInputNullArray() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        try {
            lis.lengthOfLIS(null);
            fail("Expected IllegalArgumentException for null input");
        } catch (IllegalArgumentException e) {
            // Expected behavior
        }
    }
}
