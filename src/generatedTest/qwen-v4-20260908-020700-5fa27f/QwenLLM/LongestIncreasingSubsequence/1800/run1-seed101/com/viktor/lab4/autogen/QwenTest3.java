package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest3 {
    @Test(timeout = 1000)
    public void testEmptyArray() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] numbers = {};
        int expected = 0;
        assertEquals(expected, lis.lengthOfLIS(numbers));
    }
}
