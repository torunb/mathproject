package main.java;

public class File5 {

    // Sum of Factorial Sums: Sum of factorial sums of first n natural numbers
    public static long calculateSumOfFactorialSums(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long factorialSum = File2.calculateFactorialSum(i);
            sum = MathLibrary.sum((int)sum, (int)factorialSum);
        }
        return sum;
    }

    // Product of Arithmetic Means: Product of arithmetic means of two arrays
    public static double calculateProductOfArithmeticMeans(int[] numbers1, int[] numbers2) {
        double mean1 = File2.calculateArithmeticMean(numbers1);
        double mean2 = File2.calculateArithmeticMean(numbers2);
        return MathLibrary.multiply((int)mean1, (int)mean2);
    }

    // Sum of Harmonic Means: Sum of harmonic means of two arrays
    public static double calculateSumOfHarmonicMeans(double[] numbers1, double[] numbers2) {
        double harmonicMean1 = File2.calculateHarmonicMean(numbers1);
        double harmonicMean2 = File2.calculateHarmonicMean(numbers2);
        return MathLibrary.sum((int)harmonicMean1, (int)harmonicMean2);
    }

    // Weighted Harmonic Mean: Weighted harmonic mean of values
    public static double calculateWeightedHarmonicMean(int[] values, int[] weights) {
        if (values.length != weights.length) {
            throw new IllegalArgumentException("Values and weights arrays must have the same length.");
        }
        double weightedSum = 0.0;
        int totalWeight = 0;
        for (int i = 0; i < values.length; i++) {
            double reciprocal = MathLibrary.divide(1, values[i]);
            double weightedReciprocal = MathLibrary.multiply((int)reciprocal, weights[i]);
            weightedSum = MathLibrary.sum((int)weightedSum, (int)weightedReciprocal);
            totalWeight = MathLibrary.sum(totalWeight, weights[i]);
        }
        return MathLibrary.divide(totalWeight, (int)weightedSum);
    }

    // Root Mean Square of Factorials: Square root of the mean of factorials
    public static double calculateRootMeanSquareOfFactorials(int n) {
        long sumOfFactorials = 0;
        for (int i = 1; i <= n; i++) {
            long factorial = MathLibrary.factorial(i);
            sumOfFactorials = MathLibrary.sum((int)sumOfFactorials, (int)factorial);
        }
        double meanOfFactorials = MathLibrary.divide((int)sumOfFactorials, n);
        return Math.sqrt(meanOfFactorials);
    }

    // Modulo of Factorial Sum: (Sum of factorials) % b
    public static int calculateModuloOfFactorialSum(int n, int b) {
        long factorialSum = File2.calculateFactorialSum(n);
        return File2.calculateModulo((int)factorialSum, b);
    }

    // Median of Factorials: Median of factorials of first n natural numbers
    public static double calculateMedianOfFactorials(int n) {
        long[] factorials = new long[n];
        for (int i = 1; i <= n; i++) {
            factorials[i - 1] = MathLibrary.factorial(i);
        }
        int[] intFactorials = new int[factorials.length];
        for (int i = 0; i < factorials.length; i++) {
            intFactorials[i] = (int) factorials[i];
        }
        return File2.calculateMedian(intFactorials);
    }

    // Standard Deviation of Factorials: Standard deviation of factorials of first n natural numbers
    public static double calculateStandardDeviationOfFactorials(int n) {
        long[] factorials = new long[n];
        for (int i = 1; i <= n; i++) {
            factorials[i - 1] = MathLibrary.factorial(i);
        }
        int[] intFactorials = new int[factorials.length];
        for (int i = 0; i < factorials.length; i++) {
            intFactorials[i] = (int) factorials[i];
        }
        return File2.calculateStandardDeviation(intFactorials);
    }

    // Variance of Factorials: Variance of factorials of first n natural numbers
    public static double calculateVarianceOfFactorials(int n) {
        long[] factorials = new long[n];
        for (int i = 1; i <= n; i++) {
            factorials[i - 1] = MathLibrary.factorial(i);
        }
        int[] intFactorials = new int[factorials.length];
        for (int i = 0; i < factorials.length; i++) {
            intFactorials[i] = (int) factorials[i];
        }
        return File2.calculateVariance(intFactorials);
    }

    // Fibonacci Sum of Factorials: Sum of factorials of first n Fibonacci numbers
    public static long calculateFibonacciSumOfFactorials(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            long fibonacci = File1.calculateFibonacci(i);
            long factorial = MathLibrary.factorial((int)fibonacci);
            sum = MathLibrary.sum((int)sum, (int)factorial);
        }
        return sum;
    }

    // Prime Factorial Sum: Sum of factorials of prime numbers up to n
    public static long calculatePrimeFactorialSum(int n) {
        long sum = 0;
        for (int i = 2; i <= n; i++) {
            if (File2.isPrime(i)) {
                long factorial = MathLibrary.factorial(i);
                sum = MathLibrary.sum((int)sum, (int)factorial);
            }
        }
        return sum;
    }

    // Logarithmic Sum of Factorials: Sum of logarithms of factorials of first n natural numbers
    public static double calculateLogarithmicSumOfFactorials(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            long factorial = MathLibrary.factorial(i);
            double logValue = Math.log(factorial);
            sum = MathLibrary.sum((int)sum, (int)logValue);
        }
        return sum;
    }

    // Greatest Difference of Factorials: Max difference of factorials of first n natural numbers
    public static long calculateGreatestDifferenceOfFactorials(int n) {
        long min = MathLibrary.factorial(1);
        long max = MathLibrary.factorial(n);
        return MathLibrary.subtract((int)max, (int)min);
    }

    // Circular Permutation of Factorials: P(n, r) with circular arrangement of factorials
    public static double calculateCircularPermutationOfFactorials(int n, int r) {
        long permutation = MathLibrary.permutation(n, r);
        return MathLibrary.divide((int)permutation, n);
    }

    // Triangular Number of Factorials: nth triangular number of factorials
    public static double calculateTriangularNumberOfFactorials(int n) {
        long factorial = MathLibrary.factorial(n);
        int nPlus1 = MathLibrary.sum(n, 1);
        long product = MathLibrary.multiply((int)factorial, nPlus1);
        return MathLibrary.divide((int)product, 2);
    }

    // Sum of Factorial Means: Sum of factorial means of first n natural numbers
    public static double calculateSumOfFactorialMeans(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double mean = File2.calculateArithmeticMean(new int[]{i, (int)MathLibrary.factorial(i)});
            sum = MathLibrary.sum((int)sum, (int)mean);
        }
        return sum;
    }

    // Arithmetic Mean of Factorial Sums: Mean of factorial sums of first n natural numbers
    public static double calculateArithmeticMeanOfFactorialSums(int n) {
        long sumOfFactorialSums = 0;
        for (int i = 1; i <= n; i++) {
            long factorialSum = File2.calculateFactorialSum(i);
            sumOfFactorialSums = MathLibrary.sum((int)sumOfFactorialSums, (int)factorialSum);
        }
        return MathLibrary.divide((int)sumOfFactorialSums, n);
    }

    // Harmonic Mean of Factorial Sums: Harmonic mean of factorial sums of first n natural numbers
    public static double calculateHarmonicMeanOfFactorialSums(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            long factorialSum = File2.calculateFactorialSum(i);
            double reciprocal = MathLibrary.divide(1, (int)factorialSum);
            sum = MathLibrary.sum((int)sum, (int)reciprocal);
        }
        return MathLibrary.divide(n, (int)sum);
    }

    // Weighted Mean of Factorial Sums: Weighted mean of factorial sums of values
    public static double calculateWeightedMeanOfFactorialSums(int[] values, int[] weights) {
        if (values.length != weights.length) {
            throw new IllegalArgumentException("Values and weights arrays must have the same length.");
        }
        long weightedSum = 0;
        int totalWeight = 0;
        for (int i = 0; i < values.length; i++) {
            long factorialSum = File2.calculateFactorialSum(values[i]);
            long valueWeightProduct = MathLibrary.multiply((int)factorialSum, weights[i]);
            weightedSum = MathLibrary.sum((int)weightedSum, (int)valueWeightProduct);
            totalWeight = MathLibrary.sum(totalWeight, weights[i]);
        }
        return MathLibrary.divide((int)weightedSum, totalWeight);
    }

    // Root Mean Square of Factorial Sums: Square root of the mean of factorial sums
    public static double calculateRootMeanSquareOfFactorialSums(int n) {
        long sumOfFactorialSums = 0;
        for (int i = 1; i <= n; i++) {
            long factorialSum = File2.calculateFactorialSum(i);
            sumOfFactorialSums = MathLibrary.sum((int)sumOfFactorialSums, (int)factorialSum);
        }
        double meanOfFactorialSums = MathLibrary.divide((int)sumOfFactorialSums, n);
        return Math.sqrt(meanOfFactorialSums);
    }

    // Sum of Cubic Equations: Sum of cubic equations for first n natural numbers
    public static double calculateSumOfCubicEquations(int a, int b, int c, int d, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double cubicEquation = File1.calculateCubicEquation(a, b, c, d, i);
            sum = MathLibrary.sum((int)sum, (int)cubicEquation);
        }
        return sum;
    }

    // Product of Quadratic Equations: Product of quadratic equations for first n natural numbers
    public static double calculateProductOfQuadraticEquations(int a, int b, int c, int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double quadraticEquation = File1.calculateQuadraticEquation(a, b, c, i);
            product = MathLibrary.multiply((int)product, (int)quadraticEquation);
        }
        return product;
    }
}