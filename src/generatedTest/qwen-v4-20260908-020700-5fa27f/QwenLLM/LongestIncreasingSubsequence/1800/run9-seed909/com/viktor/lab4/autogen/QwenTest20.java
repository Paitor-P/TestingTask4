package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest20 {

    @Test(timeout=1000)
    public void testLengthOfLISWithOneElement() {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        int[] numbers = {1};
        int expected = 1;
        int result = longestIncreasingSubsequence.lengthOfLIS(numbers);
        assertEquals("The length of LIS should be 1", expected, result);
    }
}
