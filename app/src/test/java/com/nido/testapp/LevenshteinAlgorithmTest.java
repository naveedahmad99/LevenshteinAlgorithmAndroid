package com.nido.testapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LevenshteinAlgorithmTest {

    @Test(timeout = 100)
    public void distanceTest() {
        assertEquals(1, LevenshteinAlgorithm.levenshtein("Haus", "Maus"));
        assertEquals(2, LevenshteinAlgorithm.levenshtein("Haus", "Mausi"));
        assertEquals(3, LevenshteinAlgorithm.levenshtein("Haus", "Häuser"));
        assertEquals(12, LevenshteinAlgorithm.levenshtein("Kartoffelsalat", "Runkelrüben"));
    }

    @Test(timeout = 100)
    public void maxDistance() {
        assertEquals(1, LevenshteinAlgorithm.levenshtein("Haus", "Maus", 2));
        assertEquals(2, LevenshteinAlgorithm.levenshtein("Haus", "Mausi",2));
        assertEquals(3, LevenshteinAlgorithm.levenshtein("Haus", "Häuser", 2));
        assertEquals(3, LevenshteinAlgorithm.levenshtein("Kartoffelsalat", "Runkelrüben", 2));

        //My Tests
        assertEquals(2, LevenshteinAlgorithm.levenshtein("Kartoffelsalat", "Runkelrüben", 1));
    }
}