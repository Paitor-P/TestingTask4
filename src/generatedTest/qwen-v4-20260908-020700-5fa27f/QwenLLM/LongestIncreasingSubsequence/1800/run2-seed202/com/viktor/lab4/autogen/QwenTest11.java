package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest11 {

    @Test(timeout=1000)
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, lis.lengthOfLIS(nums)); // Expected result: 4 (the LIS is [2, 3, 7, 101])
    }
}
