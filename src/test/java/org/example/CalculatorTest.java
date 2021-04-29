package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void factorialZero_shouldReturnOne() {
        assertEquals(1, getFactorialOfNumber(0));
    }

    @Test
    public void factorialNegativeNumber_shouldThrowException() {
        assertThrows(ArithmeticException.class, () -> getFactorialOfNumber(-1));
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

