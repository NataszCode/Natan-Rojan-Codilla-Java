package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        // Wyświetlanie elementów
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int[] negativeValues = IntStream.range(0, numbers.length)
                         .map(i -> numbers[i])
                        .filter(i -> i <= 0)
                                .toArray();
        if (negativeValues.length > 0) {
            throw new IllegalArgumentException("negative values not supported: " + Arrays.stream(negativeValues).mapToObj(String::valueOf).reduce("", (a, b) -> a + b));
        }

        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);

        // Obliczanie średniej
        return IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average()
                .orElse(0.0);
    }
}