package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest12 {

    @Test(timeout = 1000)
    public void testEmptyArray() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int result = lis.lengthOfLIS(new int[]{}); // Should return 0
        assertEquals(0, result);
    }
}
