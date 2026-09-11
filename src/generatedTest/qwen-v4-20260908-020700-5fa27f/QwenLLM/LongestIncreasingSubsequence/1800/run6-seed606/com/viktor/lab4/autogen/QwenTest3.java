package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import static org.junit.Assert.*;

import org.junit.Test;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest3 {

    @Test(timeout = 1000)
    public void testEmptyArray() {
        int[] numbers = {};
        int expected = 0;
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int result = lis.lengthOfLIS(numbers);
        assertEquals(expected, result);
    }
}
