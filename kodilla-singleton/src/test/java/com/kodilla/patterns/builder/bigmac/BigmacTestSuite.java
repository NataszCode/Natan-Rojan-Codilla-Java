package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("cucumber")
                .build();

        System.out.println(bigmac);


        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        int ingredientCount = bigmac.getIngredients().size();


        assertEquals("sesame", bun);
        assertEquals(2, burgers);
        assertEquals("standard", sauce);
        assertEquals(4, ingredientCount);
        assertTrue(bigmac.getIngredients().contains("lettuce"));
        assertTrue(bigmac.getIngredients().contains("onion"));
        assertTrue(bigmac.getIngredients().contains("bacon"));
        assertTrue(bigmac.getIngredients().contains("cucumber"));
    }
}
