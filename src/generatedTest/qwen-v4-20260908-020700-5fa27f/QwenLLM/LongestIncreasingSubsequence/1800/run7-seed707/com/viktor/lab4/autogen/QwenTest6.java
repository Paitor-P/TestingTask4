package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest6 {

    @Test(timeout = 1000)
    public void testLengthOfLISAtThreshold() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 10;
        int result = lis.lengthOfLIS(numbers);
        assertEquals(expected, result);
    }
}
