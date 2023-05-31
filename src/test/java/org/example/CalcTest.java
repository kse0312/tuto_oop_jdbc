package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void isPrime() {
        assertTrue(Calc.isPrime(3));
        assertTrue(Calc.isPrime(7));
        assertFalse(Calc.isPrime(10));
    }

    @Test
    void isPerfectNumber() {
        assertTrue(Calc.isPerfectNumber(6));
        assertTrue(Calc.isPerfectNumber(28));
        assertFalse(Calc.isPerfectNumber(100));
    }

    @Test
    void findMeasureList() {
        assertArrayEquals(new int[]{1, 2, 4, 8}, Calc.findMeasureList(16));
        assertArrayEquals(new int[]{1, 2, 4, 5, 10, 20, 25, 50}, Calc.findMeasureList(100));
    }
}