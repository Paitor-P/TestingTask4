package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest26 {

    @Test(timeout = 1000)
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

        // Test case 1: Small array with one element
        int[] arr1 = {1};
        assertEquals(1, lis.lengthOfLIS(arr1));

        // Test case 2: Small array with two elements
        int[] arr2 = {1, 2};
        assertEquals(2, lis.lengthOfLIS(arr2));

        // Test case 3: Small array with increasing elements
        int[] arr3 = {1, 2, 3, 4, 5};
        assertEquals(5, lis.lengthOfLIS(arr3));

        // Test case 4: Small array with decreasing elements
        int[] arr4 = {5, 4, 3, 2, 1};
        assertEquals(1, lis.lengthOfLIS(arr4));

        // Test case 5: Small array with mixed elements
        int[] arr5 = {2, 5, 3, 4, 1, 6};
        assertEquals(4, lis.lengthOfLIS(arr5));
    }
}
