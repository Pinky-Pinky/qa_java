package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void shouldReturnHerbivoreFood() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        List<String> actual = animal.getFood("Травоядное");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = animal.getFood("Хищник");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionOnUnknownAnimalKind() {
        try {
            animal.getFood("Нечто");
            fail("Ожидалось исключение");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void shouldReturnFamilyDescription() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}
