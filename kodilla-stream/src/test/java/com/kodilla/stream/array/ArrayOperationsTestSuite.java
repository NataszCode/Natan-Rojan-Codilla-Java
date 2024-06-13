package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        double average = ArrayOperations.getAverage(numbers);


        assertEquals(10.5, average, 0.01);
    }
    @Test

    void testCases() {

        int[] numbers = {-3,5};
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> ArrayOperations.getAverage(numbers),
                "Expected doThing() to throw, but it didn't"
        );
        String exceptionMessage = thrown.getMessage();
        assertEquals("negative values not supported: -3", exceptionMessage);
    }

}