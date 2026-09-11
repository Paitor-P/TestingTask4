package com.viktor.lab4;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

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

