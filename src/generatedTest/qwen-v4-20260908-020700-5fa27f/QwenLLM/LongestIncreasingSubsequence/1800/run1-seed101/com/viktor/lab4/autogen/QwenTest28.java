package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest28 {

    @Test(timeout=1000)
    public void testLengthOfLIS() {
        int[] numbers = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        
        // Create an instance of LongestIncreasingSubsequence
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int result = lis.lengthOfLIS(numbers);
        
        assertEquals(expected, result);
    }
}
