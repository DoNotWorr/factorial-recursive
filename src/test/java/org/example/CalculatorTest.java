package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @DisplayName("0! should be 1")
    @Test
    public void factorialZero_shouldReturnOne() {
        assertEquals(1, getFactorialOfNumber(0));
    }

    @DisplayName("1! should be 1")
    @Test
    public void factorialOne_shouldReturnOne() {
        assertEquals(1, getFactorialOfNumber(1));
    }

    @DisplayName("2! should be 2")
    @Test
    public void factorialTwo_shouldReturnTwo() {
        assertEquals(2, getFactorialOfNumber(2));
    }

    @DisplayName("3! should be 6")
    @Test
    public void factorialThree_shouldReturnSix() {
        assertEquals(6, getFactorialOfNumber(3));
    }

    @DisplayName("12! should be 479001600")
    @Test
    public void factorialTwelve_shouldReturnBigNumber() {
        assertEquals(479001600, getFactorialOfNumber(12));
    }

    @DisplayName("(-1)! is undefined and should throw ArithmeticException")
    @Test
    public void factorialNegativeNumber_shouldThrowException() {
        assertThrows(ArithmeticException.class, () -> getFactorialOfNumber(-1));
    }

    @DisplayName("13! causes integer overflow and should throw IllegalArgumentException")
    @Test
    public void factorialThirteen_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorialOfNumber(13));
    }

    @DisplayName("Integer.MAX_VALUE! causes integer overflow and should throw IllegalArgumentException")
    @Test
    public void factorialIntMaxValue_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorialOfNumber(Integer.MAX_VALUE));
    }

    /**
     * Creates instance of Calculator and uses factorial method on the argument
     *
     * @param n the number to use
     * @return n factorial (n!)
     */
    private int getFactorialOfNumber(int n) {
        return new Calculator().factorial(n);
    }
}

