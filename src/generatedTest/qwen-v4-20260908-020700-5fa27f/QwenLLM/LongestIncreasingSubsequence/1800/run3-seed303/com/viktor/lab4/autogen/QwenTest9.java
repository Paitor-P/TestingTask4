package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;
import com.viktor.lab4.LongestIncreasingSubsequence;

public class QwenTest9 {

    @Test(timeout = 1000)
    public void testEmptyArray() {
        int[] numbers = {};
        assertEquals(0, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }
}
