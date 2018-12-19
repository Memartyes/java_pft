package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {

    @Test
    public void test0() {
        Equation equ = new Equation(1, 1, 1);
        Assert.assertEquals(equ.rootNumber(), 0);
    }

    @Test
    public void test1() {
        Equation equ = new Equation(1, 2, 1);
        Assert.assertEquals(equ.rootNumber(), 1);
    }

    @Test
    public void test2() {
        Equation equ = new Equation(1, 5, 6);
        Assert.assertEquals(equ.rootNumber(), 2);
    }

    @Test
    public void testLinear() {
        Equation equ = new Equation(0, 1, 1);
        Assert.assertEquals(equ.rootNumber(), 1);
    }

    @Test
    public void testConstant() {
        Equation equ = new Equation(0, 0, 1);
        Assert.assertEquals(equ.rootNumber(), 0);
    }

    @Test
    public void testZero() {
        Equation equ = new Equation(0, 0, 0);
        Assert.assertEquals(equ.rootNumber(), -1);
    }
}
