package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    void test_av1() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.average(5, 10), 7.5);
    }

    @Test
    void test_av2() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.average(3, 9), 6);
    }

    @Test
    void test_good1() {
        var sqrt = new Sqrt(1);
        assertFalse(sqrt.good(7, 2));
    }

    @Test
    void test_good2() {
        var sqrt = new Sqrt(1);
        assertTrue(sqrt.good(0, 0));
    }

    @Test
    void test_good3() {
        var sqrt = new Sqrt(0);
        assertTrue(sqrt.good(2, 4));
    }

    @Test
    void test_imp1() {
        var sqrt = new Sqrt(0);
        assertEquals(sqrt.improve(1, 4), 2.5);
    }

    @Test
    void test_impr2() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.improve(9, 15), 5.333333333333333);
    }

    @Test
    void test_iter1() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.iter(1, 1), 1);
    }

    @Test
    void test_iter2() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.iter(1, 169), 13, sqrt.delta);
    }

    @Test
    void test_iter3() {
        var sqrt = new Sqrt(16);
        assertEquals(sqrt.iter(4, 16), 4, sqrt.delta);
    }

    @Test
    void test_iter4() {
        var sqrt = new Sqrt(25);
        assertEquals(sqrt.iter(5, 25), 5, sqrt.delta);
    }

    @Test
    void test_calc1() {
        var sqrt = new Sqrt(1);
        assertEquals(sqrt.calc(), 1, sqrt.delta);
    }

    @Test
    void test_calc2() {
        var sqrt = new Sqrt(25);
        assertEquals(sqrt.calc(), 5, sqrt.delta);
    }

    @Test
    void test_calc3() {
        var sqrt = new Sqrt(100);
        assertEquals(sqrt.calc(), 10, sqrt.delta);
    }

    @Test
    void test_calc4() {
        var sqrt = new Sqrt(2);
        assertEquals(sqrt.calc(), Math.sqrt(2), sqrt.delta);
    }
}
