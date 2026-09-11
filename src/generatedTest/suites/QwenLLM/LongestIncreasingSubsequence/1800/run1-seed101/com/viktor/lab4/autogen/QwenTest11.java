package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class QwenTest11 {

    @Test(timeout = 1000)
    public void testLengthOfLIS() {
        int[] testArray = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        int expected = 6;
        assertEquals(expected, new LongestIncreasingSubsequence().lengthOfLIS(testArray));
    }
}
