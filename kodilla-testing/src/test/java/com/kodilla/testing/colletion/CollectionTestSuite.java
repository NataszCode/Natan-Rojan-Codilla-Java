package com.kodilla.testing.colletion;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testy dla klasy OddNumbersExterminator")
public class CollectionTestSuite {

    private OddNumbersExterminator exterminator;
    private List<Integer> inputNumbers;

    @BeforeEach
    void setUp() {
        exterminator = new OddNumbersExterminator();
        inputNumbers = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        exterminator = null;
        inputNumbers = null;
    }

    @Test
    @DisplayName("Sprawdza, czy klasa zachowuje się poprawnie, gdy lista jest pusta")
    public void testOddNumbersExterminatorEmptyList() {


        List<Integer> result = exterminator.exterminate(inputNumbers);


        assertEquals(0, result.size(), "Pusta lista powinna skutkować pustą listą wynikową");
    }

    @Test
    @DisplayName("Sprawdza, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste")
    public void testOddNumbersExterminatorNormalList() {

        inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);


        List<Integer> result = exterminator.exterminate(inputNumbers);


        List<Integer> expectedOutput = Arrays.asList(2, 4, 6);
        assertEquals(expectedOutput, result, "Liczby parzyste powinny być poprawnie odfiltrowane");
    }
}
