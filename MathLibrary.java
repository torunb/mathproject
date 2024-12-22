package main.java;

public class MathLibrary {

    // Summation
    public static int sum(int a, int b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Exponential
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Factorial
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is not defined.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Combination
    public static long combination(int n, int r) {
        if (r > n || n < 0 || r < 0) {
            throw new IllegalArgumentException("Invalid values for n and r.");
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Permutation
    public static long permutation(int n, int r) {
        if (r > n || n < 0 || r < 0) {
            throw new IllegalArgumentException("Invalid values for n and r.");
        }
        return factorial(n) / factorial(n - r);
    }

}
