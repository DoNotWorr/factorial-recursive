package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

