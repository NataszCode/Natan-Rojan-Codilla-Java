package com.kodilla.testing.colletion;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static void main(String[] args) {

        List<Integer> inputNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result = exterminator.exterminate(inputNumbers);

        System.out.println("Liczby parzyste:");
        for (Integer evenNumber : result) {
            System.out.println(evenNumber);
        }
    }
}
