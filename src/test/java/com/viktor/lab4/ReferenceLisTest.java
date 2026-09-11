package com.viktor.lab4;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReferenceLisTest {

    @Test
    void resultMatchesReferenceOutput() throws IOException {
        Path referenceDir = Path.of("src", "test", "resources", "reference");
        String input = Files.readString(referenceDir.resolve("lis-input.json"));
        int expected = Integer.parseInt(
                Files.readString(referenceDir.resolve("lis-expected.txt")).trim()
        );

        Object parsed = new SimpleJsonParser().parse(input);
        List<?> values = (List<?>) parsed;
        int[] numbers = values.stream()
                .mapToInt(value -> ((Number) value).intValue())
                .toArray();

        int actual = new LongestIncreasingSubsequence().lengthOfLIS(numbers);

        assertEquals(expected, actual);
    }
}
