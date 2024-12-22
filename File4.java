package main.java;

public class File4 {

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

    // Sum of Exponential Growths: Sum of exponential growths for first n natural numbers
    public static double calculateSumOfExponentialGrowths(double initialAmount, double growthRate, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double exponentialGrowth = File1.calculateExponentialGrowth(initialAmount, growthRate, i);
            sum = MathLibrary.sum((int)sum, (int)exponentialGrowth);
        }
        return sum;
    }

    // Product of Logarithmic Functions: Product of logarithmic functions for first n natural numbers
    public static double calculateProductOfLogarithmicFunctions(double base, int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double logarithmicFunction = File1.calculateLogarithmicFunction(base, i);
            product = MathLibrary.multiply((int)product, (int)logarithmicFunction);
        }
        return product;
    }

    // Sum of Sine Waves: Sum of sine waves for first n natural numbers
    public static double calculateSumOfSineWaves(double amplitude, double frequency, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double sineWave = File1.calculateSineWave(amplitude, frequency, i);
            sum = MathLibrary.sum((int)sum, (int)sineWave);
        }
        return sum;
    }

    // Product of Cosine Waves: Product of cosine waves for first n natural numbers
    public static double calculateProductOfCosineWaves(double amplitude, double frequency, int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double cosineWave = File1.calculateCosineWave(amplitude, frequency, i);
            product = MathLibrary.multiply((int)product, (int)cosineWave);
        }
        return product;
    }

    // Sum of Tangent Waves: Sum of tangent waves for first n natural numbers
    public static double calculateSumOfTangentWaves(double amplitude, double frequency, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double tangentWave = File1.calculateTangentWave(amplitude, frequency, i);
            sum = MathLibrary.sum((int)sum, (int)tangentWave);
        }
        return sum;
    }

    // Product of Compound Interests: Product of compound interests for first n natural numbers
    public static double calculateProductOfCompoundInterests(double principal, double rate, int timesCompounded, int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double compoundInterest = File1.calculateCompoundInterest(principal, rate, timesCompounded, i);
            product = MathLibrary.multiply((int)product, (int)compoundInterest);
        }
        return product;
    }

    // Sum of Distances Between Points: Sum of distances between points for first n natural numbers
    public static double calculateSumOfDistancesBetweenPoints(int x1, int y1, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double distance = File1.calculateDistanceBetweenPoints(x1, y1, i, i);
            sum = MathLibrary.sum((int)sum, (int)distance);
        }
        return sum;
    }

    // Product of Pythagorean Theorems: Product of Pythagorean theorems for first n natural numbers
    public static double calculateProductOfPythagoreanTheorems(int a, int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double pythagoreanTheorem = File1.calculatePythagoreanTheorem(a, i);
            product = MathLibrary.multiply((int)product, (int)pythagoreanTheorem);
        }
        return product;
    }

    // Sum of Fibonacci Numbers: Sum of first n Fibonacci numbers
    public static long calculateSumOfFibonacciNumbers(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            long fibonacci = File1.calculateFibonacci(i);
            sum = MathLibrary.sum((int)sum, (int)fibonacci);
        }
        return sum;
    }

    // Product of Arithmetic Series: Product of arithmetic series for first n natural numbers
    public static double calculateProductOfArithmeticSeries(int a, int d, int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double arithmeticSeries = File1.calculateArithmeticSeries(a, d, i);
            product = MathLibrary.multiply((int)product, (int)arithmeticSeries);
        }
        return product;
    }

    // Sum of Geometric Series: Sum of geometric series for first n natural numbers
    public static double calculateSumOfGeometricSeries(double a, double r, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double geometricSeries = File1.calculateGeometricSeries(a, r, i);
            sum = MathLibrary.sum((int)sum, (int)geometricSeries);
        }
        return sum;
    }

    // Product of Harmonic Series: Product of harmonic series for first n natural numbers
    public static double calculateProductOfHarmonicSeries(int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double harmonicSeries = File1.calculateHarmonicSeries(i);
            product = MathLibrary.multiply((int)product, (int)harmonicSeries);
        }
        return product;
    }

    // Sum of Binomial Coefficients: Sum of binomial coefficients for first n natural numbers
    public static long calculateSumOfBinomialCoefficients(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            long binomialCoefficient = File1.calculateBinomialCoefficient(n, i);
            sum = MathLibrary.sum((int)sum, (int)binomialCoefficient);
        }
        return sum;
    }

    // Product of Permutations: Product of permutations for first n natural numbers
    public static long calculateProductOfPermutations(int n, int r) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            long permutation = File1.calculatePermutation(i, r);
            product = MathLibrary.multiply((int)product, (int)permutation);
        }
        return product;
    }

    // Sum of Squares: Sum of squares of first n natural numbers
    public static double calculateSumOfSquares(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double square = File1.calculateSumOfSquares(i);
            sum = MathLibrary.sum((int)sum, (int)square);
        }
        return sum;
    }

    // Product of Cubes: Product of cubes of first n natural numbers
    public static double calculateProductOfCubes(int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double cube = File1.calculateSumOfCubes(i);
            product = MathLibrary.multiply((int)product, (int)cube);
        }
        return product;
    }

    // Sum of GCDs: Sum of GCDs of first n natural numbers with a given number
    public static int calculateSumOfGCDs(int a, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int gcd = File1.calculateGCD(a, i);
            sum = MathLibrary.sum(sum, gcd);
        }
        return sum;
    }

    // Product of LCMs: Product of LCMs of first n natural numbers with a given number
    public static double calculateProductOfLCMs(int a, int n) {
        double product = 1.0;
        for (int i = 1; i <= n; i++) {
            double lcm = File1.calculateLCM(a, i);
            product = MathLibrary.multiply((int)product, (int)lcm);
        }
        return product;
    }
}