package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class QwenTest8 {

    @Test(timeout = 1000)
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

        int[] numbers1 = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, lis.lengthOfLIS(numbers1));

        int[] numbers2 = {0, 1, 0, 3, 2, 3};
        assertEquals(4, lis.lengthOfLIS(numbers2));

        int[] numbers3 = {7, 7, 7, 7, 7};
        assertEquals(1, lis.lengthOfLIS(numbers3));

        int[] numbers4 = {};
        assertEquals(0, lis.lengthOfLIS(numbers4));

        int[] numbers5 = {1};
        assertEquals(1, lis.lengthOfLIS(numbers5));
    }
}
