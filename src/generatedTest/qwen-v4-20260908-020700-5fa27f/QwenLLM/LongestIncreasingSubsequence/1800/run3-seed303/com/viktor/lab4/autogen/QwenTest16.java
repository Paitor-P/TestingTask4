package com.viktor.lab4.autogen;
import com.viktor.lab4.LongestIncreasingSubsequence;
import com.viktor.lab4.LongestIncreasingSubsequence.*;
import org.junit.*;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import java.util.Arrays;

public class QwenTest16 {

    public static class LongestIncreasingSubsequence {
        public int lengthOfLIS(int[] numbers) {
            if (numbers == null) {
                throw new IllegalArgumentException("numbers must not be null");
            }
            if (numbers.length == 0) {
                return 0;
            }

            int[] tails = new int[numbers.length];
            int size = 0;

            for (int number : numbers) {
                int index = Arrays.binarySearch(tails, 0, size, number);
                if (index < 0) {
                    index = -(index + 1);
                }
                tails[index] = number;
                if (index == size) {
                    size++;
                }
            }

            return size;
        }
    }

    @Test(timeout = 1000)
    public void testSingleElementSubsequence() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] numbers = {5};
        int expected = 1;
        assertEquals(expected, lis.lengthOfLIS(numbers));
    }
}
