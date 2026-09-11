package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest13 {

    @Test(timeout = 1000)
    public void testNullInput() {
        try {
            new LongestIncreasingSubsequence().lengthOfLIS(null);
            fail("IllegalArgumentException should be thrown for null input");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}
