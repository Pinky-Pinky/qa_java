package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class LionTest {

    @Test
    public void shouldHaveManeIfMale() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void shouldNotHaveManeIfFemale() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void shouldThrowExceptionIfSexIsInvalid() {
        try {
            new Lion("???", new Feline());
            fail("Ожидалось исключение");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void shouldReturnPredatorFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("Самец", mockFeline);
        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void shouldReturnKittensCount() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", mockFeline);

        assertEquals(3, lion.getKittens());
    }
}
