package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest4 {

    @Test(timeout = 1000)
    public void testEmptyInput() {
        int[] numbers = {};
        int expected = 0;
        int result = new LongestIncreasingSubsequence().lengthOfLIS(numbers);
        assertEquals(expected, result);
    }
}
