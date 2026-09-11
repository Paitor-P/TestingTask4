package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class QwenTest8 {

    @Test(timeout=1000)
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, lis.lengthOfLIS(nums1));

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        assertEquals(4, lis.lengthOfLIS(nums2));

        int[] nums3 = {1, 3, 6, 7, 9, 4, 10, 5, 2};
        assertEquals(6, lis.lengthOfLIS(nums3));

        int[] nums4 = {4, 10, 4, 3, 8, 9};
        assertEquals(3, lis.lengthOfLIS(nums4));

        int[] nums5 = {};
        assertEquals(0, lis.lengthOfLIS(nums5));

        int[] nums6 = {7};
        assertEquals(1, lis.lengthOfLIS(nums6));
    }
}
