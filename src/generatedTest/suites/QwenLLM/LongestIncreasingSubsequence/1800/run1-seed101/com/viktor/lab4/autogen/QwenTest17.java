package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class QwenTest17 {

    @Test(timeout = 1000)
    public void testLengthOfLIS() {
        int[] numbers = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4; // The longest increasing subsequence is [2, 3, 7, 101]
        int result = new LongestIncreasingSubsequence().lengthOfLIS(numbers);
        assertEquals(expected, result);
    }
}
