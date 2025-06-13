package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class LionTest {

    @Test
    public void doesHaveManeReturnsTrueForMale() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeReturnsFalseForFemale() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void invalidSexThrowsException() {
        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion("Нейтральный", new Feline())
        );
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void getFoodUsesFeline() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Мясо"), lion.getFood());
    }
}
