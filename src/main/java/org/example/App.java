package org.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        for (int i = -1; i < 14; i++) {
            try {
                int result = calculator.factorial(i);
                System.out.printf("%d! is %d\n", i, result);
            } catch (IllegalArgumentException e) {
                System.out.printf("%d! causes integer overflow\n", i);
            } catch (ArithmeticException e) {
                System.out.printf("%d! is undefined\n", i);
            }
        }
    }
}
