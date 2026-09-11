package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest6 {

    @Test(timeout = 1000)
    public void testLengthOfLISWithSingleElement() {
        int[] numbers = {5};
        assertEquals(1, new LongestIncreasingSubsequence().lengthOfLIS(numbers));
    }
}
