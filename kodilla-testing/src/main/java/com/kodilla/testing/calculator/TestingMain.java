package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        testAddition();
        testSubtraction();
    }

    public static void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(7, 4);
        if (result == 11) {
            System.out.println("Addition test passed.");
        } else {
            System.out.println("Addition test failed.");
        }
    }

    public static void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(7, 4);
        if (result == 2) {
            System.out.println("Subtraction test passed.");
        } else {
            System.out.println("Subtraction test failed.");
        }
    }
}
