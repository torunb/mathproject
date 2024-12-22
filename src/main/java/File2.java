package main.java;

public class File2 {

    // Factorial Sum: Sum of factorials of first n natural numbers
    public static long calculateFactorialSum(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long factorial = MathLibrary.factorial(i);
            sum = MathLibrary.sum((int)sum, (int)factorial);
        }
        return sum;
    }

    // Arithmetic Mean: Mean of an array of integers
    public static double calculateArithmeticMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum = MathLibrary.sum(sum, num);
        }
        int length = numbers.length;
        return MathLibrary.divide(sum, length);
    }

    // Harmonic Mean: Harmonic mean of an array of numbers
    public static double calculateHarmonicMean(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            double reciprocal = MathLibrary.divide(1, (int)num);
            sum = MathLibrary.sum((int)sum, (int)reciprocal);
        }
        int length = numbers.length;
        return MathLibrary.divide(length, (int)sum);
    }

    // Weighted Mean: Weighted mean of values
    public static double calculateWeightedMean(int[] values, int[] weights) {
        if (values.length != weights.length) {
            throw new IllegalArgumentException("Values and weights arrays must have the same length.");
        }
        int weightedSum = 0;
        int totalWeight = 0;
        for (int i = 0; i < values.length; i++) {
            int valueWeightProduct = MathLibrary.multiply(values[i], weights[i]);
            weightedSum = MathLibrary.sum(weightedSum, valueWeightProduct);
            totalWeight = MathLibrary.sum(totalWeight, weights[i]);
        }
        return MathLibrary.divide(weightedSum, totalWeight);
    }

    // Root Mean Square: Square root of the mean of squared values
    public static double calculateRootMeanSquare(int[] numbers) {
        int sumOfSquares = 0;
        for (int num : numbers) {
            int square = (int) MathLibrary.power(num, 2);
            sumOfSquares = MathLibrary.sum(sumOfSquares, square);
        }
        int length = numbers.length;
        double meanOfSquares = MathLibrary.divide(sumOfSquares, length);
        return Math.sqrt(meanOfSquares);
    }

    // Modulo Operation: a % b
    public static int calculateModulo(int a, int b) {
        double quotient = MathLibrary.divide(a, b);
        int product = MathLibrary.multiply((int)quotient, b);
        return MathLibrary.subtract(a, product);
    }

    // Median: Median of an array of integers
    public static double calculateMedian(int[] numbers) {
        java.util.Arrays.sort(numbers);
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            int leftMiddle = numbers[middle - 1];
            int rightMiddle = numbers[middle];
            int sumOfMiddles = MathLibrary.sum(leftMiddle, rightMiddle);
            return MathLibrary.divide(sumOfMiddles, 2);
        } else {
            return numbers[middle];
        }
    }

    // Standard Deviation: Standard deviation of an array of integers
    public static double calculateStandardDeviation(int[] numbers) {
        double mean = calculateArithmeticMean(numbers);
        double sum = 0.0;
        for (int num : numbers) {
            double deviation = num - mean;
            double squaredDeviation = MathLibrary.power(deviation, 2);
            sum = MathLibrary.sum((int)sum, (int)squaredDeviation);
        }
        int length = numbers.length;
        double variance = MathLibrary.divide((int)sum, length);
        return Math.sqrt(variance);
    }

    // Variance: Variance of an array of integers
    public static double calculateVariance(int[] numbers) {
        double mean = calculateArithmeticMean(numbers);
        double sum = 0.0;
        for (int num : numbers) {
            double deviation = num - mean;
            double squaredDeviation = MathLibrary.power(deviation, 2);
            sum = MathLibrary.sum((int)sum, (int)squaredDeviation);
        }
        int length = numbers.length;
        return MathLibrary.divide((int)sum, length);
    }

    // Fibonacci Sum: Sum of first n Fibonacci numbers
    public static long calculateFibonacciSum(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            long fibonacci = File1.calculateFibonacci(i);
            sum = MathLibrary.sum((int)sum, (int)fibonacci);
        }
        return sum;
    }

    // Prime Check: Check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            int remainder = calculateModulo(number, i);
            if (remainder == 0) return false;
        }
        return true;
    }

    // Sum of Primes: Sum of prime numbers up to n
    public static long calculateSumOfPrimes(int n) {
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum = MathLibrary.sum((int)sum, i);
            }
        }
        return sum;
    }

    // Logarithmic Sum: Sum of logarithms of first n numbers
    public static double calculateLogarithmicSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double logValue = Math.log(i);
            sum = MathLibrary.sum((int)sum, (int)logValue);
        }
        return sum;
    }

    // Greatest Difference: Max difference in an array
    public static int calculateGreatestDifference(int[] numbers) {
        int min = java.util.Arrays.stream(numbers).min().getAsInt();
        int max = java.util.Arrays.stream(numbers).max().getAsInt();
        return MathLibrary.subtract(max, min);
    }

    // Circular Permutation: P(n, r) with circular arrangement
    public static double calculateCircularPermutation(int n, int r) {
        long permutation = MathLibrary.permutation(n, r);
        return MathLibrary.divide((int)permutation, n);
    }

    // Triangular Number: nth triangular number
    public static double calculateTriangularNumber(int n) {
        int nPlus1 = MathLibrary.sum(n, 1);
        int product = MathLibrary.multiply(n, nPlus1);
        return MathLibrary.divide(product, 2);
    }

    // Sum of Factorials: Sum of factorials of first n natural numbers
    public static long calculateSumOfFactorials(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long factorial = MathLibrary.factorial(i);
            sum = MathLibrary.sum((int)sum, (int)factorial);
        }
        return sum;
    }

    // Arithmetic Mean of Squares: Mean of squares of an array of integers
    public static double calculateArithmeticMeanOfSquares(int[] numbers) {
        int sumOfSquares = 0;
        for (int num : numbers) {
            int square = (int) MathLibrary.power(num, 2);
            sumOfSquares = MathLibrary.sum(sumOfSquares, square);
        }
        int length = numbers.length;
        return MathLibrary.divide(sumOfSquares, length);
    }

    // Harmonic Mean of Squares: Harmonic mean of squares of an array of numbers
    public static double calculateHarmonicMeanOfSquares(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            double reciprocal = MathLibrary.divide(1, (int)MathLibrary.power(num, 2));
            sum = MathLibrary.sum((int)sum, (int)reciprocal);
        }
        int length = numbers.length;
        return MathLibrary.divide(length, (int)sum);
    }

    // Weighted Mean of Squares: Weighted mean of squares of values
    public static double calculateWeightedMeanOfSquares(int[] values, int[] weights) {
        if (values.length != weights.length) {
            throw new IllegalArgumentException("Values and weights arrays must have the same length.");
        }
        int weightedSum = 0;
        int totalWeight = 0;
        for (int i = 0; i < values.length; i++) {
            int square = (int) MathLibrary.power(values[i], 2);
            int valueWeightProduct = MathLibrary.multiply(square, weights[i]);
            weightedSum = MathLibrary.sum(weightedSum, valueWeightProduct);
            totalWeight = MathLibrary.sum(totalWeight, weights[i]);
        }
        return MathLibrary.divide(weightedSum, totalWeight);
    }

    // Root Mean Square of Squares: Square root of the mean of squared values
    public static double calculateRootMeanSquareOfSquares(int[] numbers) {
        int sumOfSquares = 0;
        for (int num : numbers) {
            int fourthPower = (int) MathLibrary.power(num, 4);
            sumOfSquares = MathLibrary.sum(sumOfSquares, fourthPower);
        }
        int length = numbers.length;
        double meanOfSquares = MathLibrary.divide(sumOfSquares, length);
        return Math.sqrt(meanOfSquares);
    }
}