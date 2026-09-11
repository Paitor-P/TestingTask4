package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest38 {
    @Test(timeout = 1000)
    public void testLengthOfLIS() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(nums));
    }
}
