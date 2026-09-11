package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest14 {

    @Test(timeout=1000)
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] numbers = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        assertEquals(expected, lis.lengthOfLIS(numbers));
    }
}
