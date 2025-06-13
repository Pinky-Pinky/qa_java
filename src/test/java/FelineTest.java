package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные"));
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensReturnsProvidedCount() {
        assertEquals(5, feline.getKittens(5));
    }
}
