package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest12 {

    @Test(timeout = 1000)
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] input = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        int result = lis.lengthOfLIS(input);
        assertEquals(expected, result);
    }
}
