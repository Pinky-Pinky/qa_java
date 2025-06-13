package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Predator predator = mock(Predator.class);
        Cat cat = new Cat(predator);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodUsesPredator() throws Exception {
        Predator predator = mock(Predator.class);
        when(predator.eatMeat()).thenReturn(List.of("Рыба"));
        Cat cat = new Cat(predator);
        assertEquals(List.of("Рыба"), cat.getFood());
    }
}
