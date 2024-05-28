package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        // Given
        Country poland = new Country(new BigDecimal("38000000"));
        Country germany = new Country(new BigDecimal("83000000"));
        Country france = new Country(new BigDecimal("67000000"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Country china = new Country(new BigDecimal("1400000000"));
        Country india = new Country(new BigDecimal("1300000000"));

        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        // When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        // Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("1938000000");
        assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
