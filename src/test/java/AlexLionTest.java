package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class AlexLionTest {

    @Test
    public void getFriendsReturnsCorrectList() throws Exception {
        AlexLion alex = new AlexLion(new Feline());
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() throws Exception {
        AlexLion alex = new AlexLion(new Feline());
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittensReturnsZero() throws Exception {
        AlexLion alex = new AlexLion(new Feline());
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void inheritedMethodWorks() throws Exception {
        AlexLion alex = new AlexLion(new Feline());
        assertTrue(alex.doesHaveMane());
    }
}
