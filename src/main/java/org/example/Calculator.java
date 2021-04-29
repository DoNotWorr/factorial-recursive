package org.example;

public class Calculator {

    public int factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("Factorial is undefined for negative number: " + n);
        }
        if (n < 2) {
            return 1;
        }
        return 2;
    }
}
