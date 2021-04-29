package org.example;

public class Calculator {

    /**
     * Calculates n factorial
     *
     * @param n number to calculate factorial of
     * @return n factorial (n!)
     * @throws ArithmeticException when factorial is undefined for n (negative n)
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("Factorial is undefined for negative number: " + n);
        }
        return factorial(n, 1);
    }

    /**
     * Helper method to achieve tail recursion
     *
     * @param n           number to calculate factorial of
     * @param accumulator stores the value through each recursion
     * @return n factorial (n!)
     */
    private int factorial(int n, int accumulator) throws IllegalArgumentException {
        if (n == 0) {
            return accumulator;
        }
        if (Integer.MAX_VALUE / accumulator < n) {
            throw new IllegalArgumentException("Factorial of " + n + " is too big to store in Integer");
        }
        return factorial(n - 1, n * accumulator);
    }
}
