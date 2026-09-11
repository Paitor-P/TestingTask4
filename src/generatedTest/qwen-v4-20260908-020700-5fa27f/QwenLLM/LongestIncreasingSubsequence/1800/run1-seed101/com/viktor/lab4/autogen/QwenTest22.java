package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest22 {

    @Test(timeout = 1000)
    public void testLengthOfLISBelowThreshold() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected = 9;
        assertEquals(expected, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }
}
