package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest10 {

    @Test(timeout = 1000)
    public void testLengthOfLISAtThreshold() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] numbers = {1, 3, 6, 7, 8, 9};
        int expected = 6;
        int result = lis.lengthOfLIS(numbers);
        assertEquals(expected, result);
    }
}
