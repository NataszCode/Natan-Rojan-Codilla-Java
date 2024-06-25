package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTest {

    @Test
    public void testProbablyIWillThrowException_WithinRange() {

        SecondChallenge secondChallenge = new SecondChallenge();


        assertDoesNotThrow(() -> {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.0);
            assertEquals("Done!", result);
        });
    }

    @Test
    public void testProbablyIWillThrowException_XLessThanOne() {

        SecondChallenge secondChallenge = new SecondChallenge();


        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(0.5, 1.0);
        });
    }

    @Test
    public void testProbablyIWillThrowException_XGreaterThanOrEqualTwo() {

        SecondChallenge secondChallenge = new SecondChallenge();


        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(2.0, 1.0);
        });
    }

    @Test
    public void testProbablyIWillThrowException_YEqualsOnePointFive() {

        SecondChallenge secondChallenge = new SecondChallenge();


        assertThrows(Exception.class, () -> {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
        });
    }
}
