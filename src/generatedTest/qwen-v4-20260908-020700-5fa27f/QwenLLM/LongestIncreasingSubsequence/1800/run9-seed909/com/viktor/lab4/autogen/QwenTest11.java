package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest11 {

    @Test(timeout = 1000)
    public void testLengthOfLIS() {
        int[] testArray = {10, 9, 2, 5, 3, 7, 101, 18};
        int expectedLength = 4; // The actual length of the LIS is 4: [2, 3, 7, 101]
        assertEquals(expectedLength, new LongestIncreasingSubsequence().lengthOfLIS(testArray));
    }
}
