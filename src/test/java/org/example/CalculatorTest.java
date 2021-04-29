package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void factorialZero_shouldReturnOne() {
        //Arrange
        int expected = 1;
        int value = 0;

        //Act
        int actual = getFactorialOfNumber(value);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void factorialNegativeNumber_shouldThrowException() {
        //Arrange
        int value = -1;

        //Act, Assert
        assertThrows(ArithmeticException.class, () -> getFactorialOfNumber(value));
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

