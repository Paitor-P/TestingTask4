package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest1 {

    @Test(timeout = 1000)
    public void testEmptyArray() {
        int[] numbers = {};
        assertEquals(0, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }

    @Test(timeout = 1000)
    public void testSingleElementArray() {
        int[] numbers = {5};
        assertEquals(1, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }

    @Test(timeout = 1000)
    public void testNonIncreasingArray() {
        int[] numbers = {5, 4, 3, 2, 1};
        assertEquals(1, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }

    @Test(timeout = 1000)
    public void testIncreasingArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(5, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }

    @Test(timeout = 1000)
    public void testMixedArray() {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }

    @Test(timeout = 1000)
    public void testRepeatedElements() {
        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(1, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }
}
