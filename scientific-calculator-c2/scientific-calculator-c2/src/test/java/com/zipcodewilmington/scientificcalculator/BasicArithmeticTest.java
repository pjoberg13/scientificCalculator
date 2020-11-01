package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicArithmeticTest {

    @SuppressWarnings("deprecation")
    @Test
    public void addition() {
        double v1 = 5.2;
        double v2 = 3.4;
        assertEquals(8.6, BasicArithmetic.addition(v1, v2), .000001);
    }

    @Test
    public void subtraction() {
        double v1 = 750;
        double v2 = 49;
        assertEquals(701, BasicArithmetic.subtraction(v1, v2), .000001);
    }

    @Test
    public void multiplication() {
        double v1 = 750;
        double v2 = 49;
        assertEquals(36750, BasicArithmetic.multiplication(v1, v2), .000001);
    }

    @Test
    public void division() {
        double v1 = 7;
        double v2 = 3;
        assertEquals(2.3333333333333335, BasicArithmetic.division(v1, v2), .000001);
    }
}