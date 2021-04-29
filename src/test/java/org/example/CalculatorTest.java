package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void factorialZero_shouldReturnOne() {
        //Arrange
        Calculator calculator = new Calculator();
        int expected = 1;
        int value = 0;

        //Act
        int actual = calculator.factorial(value);

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void factorialNegativeNumber_shouldThrowException() {
        //Arrange
        Calculator calculator = new Calculator();
        int value = -1;

        //Act, Assert
        assertThrows(ArithmeticException.class, () -> calculator.factorial(value));
    }
}

