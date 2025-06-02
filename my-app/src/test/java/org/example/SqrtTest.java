package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SqrtTest {

    // Тесты для метода average()
    @Test
    void testAverage_PositiveNumbers() {
        var sqrt = new Sqrt(1);
        assertEquals(7.5, sqrt.average(5, 10));
    }

    @Test
    void testAverage_NegativeNumbers() {
        var sqrt = new Sqrt(1);
        assertEquals(-2.5, sqrt.average(-5, 0));
    }

    @Test
    void testAverage_Zero() {
        var sqrt = new Sqrt(1);
        assertEquals(0, sqrt.average(0, 0));
    }

    // Тесты для метода good()
    @Test
    void testGood_TrueWhenExact() {
        var sqrt = new Sqrt(0);
        assertTrue(sqrt.good(2, 4));
    }

    @Test
    void testGood_FalseWhenNotClose() {
        var sqrt = new Sqrt(1);
        assertFalse(sqrt.good(7, 2));
    }

    @Test
    void testGood_TrueWhenWithinDelta() {
        var sqrt = new Sqrt(1);
        assertTrue(sqrt.good(1.00001, 1.00002));
    }

    // Тесты для метода improve()
    @Test
    void testImprove_PositiveNumbers() {
        var sqrt = new Sqrt(0);
        assertEquals(2.5, sqrt.improve(1, 4));
    }

    @Test
    void testImprove_One() {
        var sqrt = new Sqrt(1);
        assertEquals(1.0, sqrt.improve(1, 1));
    }

    @Test
    void testImprove_LargeNumbers() {
        var sqrt = new Sqrt(1);
        assertEquals(12500.0, sqrt.improve(20000, 100000000));
    }

    // Тесты для метода iter()
    @Test
    void testIter_ExactSquare() {
        var sqrt = new Sqrt(16);
        assertEquals(4, sqrt.iter(4, 16), sqrt.delta);
    }

    @Test
    void testIter_ConvergesToRoot() {
        var sqrt = new Sqrt(25);
        assertEquals(5, sqrt.iter(1, 25), sqrt.delta);
    }

    @Test
    void testIter_AlreadyGood() {
        var sqrt = new Sqrt(1);
        assertEquals(1, sqrt.iter(1, 1));
    }

    // Тесты для метода calc()
    @Test
    void testCalc_PerfectSquare() {
        var sqrt = new Sqrt(9);
        assertEquals(3, sqrt.calc(), sqrt.delta);
    }

    @Test
    void testCalc_NonPerfectSquare() {
        var sqrt = new Sqrt(2);
        assertEquals(Math.sqrt(2), sqrt.calc(), sqrt.delta);
    }

    @Test
    void testCalc_Zero() {
        var sqrt = new Sqrt(0);
        assertEquals(0, sqrt.calc(), sqrt.delta);
    }

    @Test
    void testCalc_One() {
        var sqrt = new Sqrt(1);
        assertEquals(1, sqrt.calc(), sqrt.delta);
    }

    @Test
    void testCalc_LargeNumber() {
        var sqrt = new Sqrt(1000000);
        assertEquals(1000, sqrt.calc(), sqrt.delta);
    }
}
