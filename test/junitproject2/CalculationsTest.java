package junitproject2;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;

import static org.junit.Assert.*;

public class CalculationsTest {

    private Calculations calculations;

    @Before
    public void init() {
        calculations = new Calculations();
        System.out.println("init is called");
    }
    

    @Test
    public void sumTestSuccess() {
        System.out.println("sumTestSuccess");
        assertEquals(9, calculations.sum(4, 5));
        assertEquals(10, calculations.sum(7, 3));
    }
    

    @Test
    public void sumTestFail() {
        System.out.println("sumTestFail");
        assertNotEquals(5, calculations.sum(10, 5));
    }

    @Test
    public void substractTestSuccess() {
        assertEquals(5, calculations.substract(10, 5));
        assertEquals(2, calculations.substract(5, 3));
    }

    @Test
    public void substractTestFail() {
        assertNotEquals(8, calculations.substract(10, 5));
        assertNotEquals(17, calculations.substract(5, 3));
    }

    @Test
    public void divideTestSuccess() {
        float delta = 1e-15f;
        assertEquals(2.00f, calculations.divide(10, 5),delta);
    }

    @Test
    public void divideTestAIsZeroReturnsZero(){
        assertThat(0, CoreMatchers.not(CoreMatchers.equalTo(calculations.divide(0, 5))));
    }
    
   
    @Test(expected = ArithmeticException.class)
    public void divideTestZero() {
        calculations.divide(7, 0);
    }

    @Test
    public void divideTestFail() {
        assertThat(22.00f, CoreMatchers.not(CoreMatchers.equalTo(calculations.divide(10, 5))));
    }

    @Test
    public void multiplyTestSuccess() {
        assertEquals(50, calculations.multiply(10, 5));
        assertEquals(15, calculations.multiply(5, 3));
    }

    @Test
    public void multiplyTestFail() {
        assertNotEquals(8, calculations.multiply(10, 5));
        assertNotEquals(17, calculations.multiply(5, 3));
    }
    
    @Test
    public void moduloTestSucces(){
        assertEquals(1, calculations.modulo(11, 5));
        assertEquals(0, calculations.modulo(10, 5));
    }

}
