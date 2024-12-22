package main.java;

public class File1 {

    // Quadratic Equation: ax^2 + bx + c
    public static double calculateQuadraticEquation(int a, int b, int c, int x) {
        int xSquared = (int) MathLibrary.power(x, 2);       // x^2
        int axSquared = MathLibrary.multiply(a, xSquared);  // a * x^2
        int bx = MathLibrary.multiply(b, x);               // b * x

        return MathLibrary.sum(MathLibrary.sum(axSquared, bx), c);
    }

    // Cubic Equation: ax^3 + bx^2 + cx + d
    public static double calculateCubicEquation(int a, int b, int c, int d, int x) {
        int xCubed = (int) MathLibrary.power(x, 3);         // x^3
        int axCubed = MathLibrary.multiply(a, xCubed);      // a * x^3
        int xSquared = (int) MathLibrary.power(x, 2);       // x^2
        int bxSquared = MathLibrary.multiply(b, xSquared);  // b * x^2
        int cx = MathLibrary.multiply(c, x);                // c * x

        return MathLibrary.sum(MathLibrary.sum(MathLibrary.sum(axCubed, bxSquared), cx), d);
    }

    // Exponential Growth: initialAmount * e^(growthRate * time)
    public static double calculateExponentialGrowth(double initialAmount, double growthRate, double time) {
        int exponent = MathLibrary.multiply((int)growthRate, (int)time); // growthRate * time
        double expValue = Math.exp(exponent);                     // e^(growthRate * time)

        return MathLibrary.multiply((int)initialAmount, (int)expValue);
    }

    // Logarithmic Function: log_base(value)
    public static double calculateLogarithmicFunction(double base, double value) {
        double logValue = Math.log(value);                  // log(value)
        double logBase = Math.log(base);                    // log(base)

        return MathLibrary.divide((int)logValue, (int)logBase);
    }

    // Sine Wave: amplitude * sin(2 * PI * frequency * time)
    public static double calculateSineWave(double amplitude, double frequency, double time) {
        double frequencyTime = MathLibrary.multiply((int)frequency, (int)time); // frequency * time
        double angle = MathLibrary.multiply(2 * (int)Math.PI, (int)frequencyTime); // 2 * PI * frequency * time
        double sineValue = Math.sin(angle);                 // sin(2 * PI * frequency * time)

        return MathLibrary.multiply((int)amplitude, (int)sineValue);
    }

    // Cosine Wave: amplitude * cos(2 * PI * frequency * time)
    public static double calculateCosineWave(double amplitude, double frequency, double time) {
        double frequencyTime = MathLibrary.multiply((int)frequency, (int)time); // frequency * time
        double angle = MathLibrary.multiply(2 * (int)Math.PI, (int)frequencyTime); // 2 * PI * frequency * time
        double cosineValue = Math.cos(angle);               // cos(2 * PI * frequency * time)

        return MathLibrary.multiply((int)amplitude, (int)cosineValue);
    }

    // Tangent Wave: amplitude * tan(2 * PI * frequency * time)
    public static double calculateTangentWave(double amplitude, double frequency, double time) {
        double frequencyTime = MathLibrary.multiply((int)frequency, (int)time); // frequency * time
        double angle = MathLibrary.multiply(2 * (int)Math.PI, (int)frequencyTime); // 2 * PI * frequency * time
        double tangentValue = Math.tan(angle);              // tan(2 * PI * frequency * time)

        return MathLibrary.multiply((int)amplitude, (int)tangentValue);
    }

    // Compound Interest: principal * (1 + rate / timesCompounded)^(timesCompounded * time)
    public static double calculateCompoundInterest(double principal, double rate, int timesCompounded, double time) {
        double ratePerCompounding = MathLibrary.divide((int)rate, (int)timesCompounded); // rate / timesCompounded
        double exponent = MathLibrary.multiply((int)timesCompounded, (int)time);         // timesCompounded * time
        double base = MathLibrary.sum(1, (int)ratePerCompounding);                  // 1 + rate / timesCompounded
        double compoundFactor = MathLibrary.power(base, (int) exponent);       // (1 + rate / timesCompounded)^(timesCompounded * time)

        return MathLibrary.multiply((int)principal, (int)compoundFactor);
    }

    // Distance Between Points: sqrt((x2 - x1)^2 + (y2 - y1)^2)
    public static double calculateDistanceBetweenPoints(int x1, int y1, int x2, int y2) {
        int deltaX = MathLibrary.subtract(x2, x1);          // x2 - x1
        int deltaY = MathLibrary.subtract(y2, y1);          // y2 - y1
        double deltaXSquared = MathLibrary.power((int)deltaX, 2);   // (x2 - x1)^2
        double deltaYSquared = MathLibrary.power((int)deltaY, 2);   // (y2 - y1)^2
        int sumOfSquares = MathLibrary.sum((int)deltaXSquared, (int)deltaYSquared); // (x2 - x1)^2 + (y2 - y1)^2

        return Math.sqrt(sumOfSquares);
    }

    // Pythagorean Theorem: sqrt(a^2 + b^2)
    public static double calculatePythagoreanTheorem(int a, int b) {
        double aSquared = MathLibrary.power(a, 2);             // a^2
        double bSquared = MathLibrary.power(b, 2);             // b^2
        int sumOfSquares = MathLibrary.sum((int)aSquared, (int)bSquared); // a^2 + b^2

        return Math.sqrt(sumOfSquares);
    }

    // Fibonacci Sequence: nth Fibonacci number
    public static long calculateFibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = MathLibrary.sum((int) a, (int) b);          // a + b
            a = b;
            b = c;
        }
        return b;
    }

    // Arithmetic Series: sum of first n terms
    public static double calculateArithmeticSeries(int a, int d, int n) {
        int two = 2;
        int firstTermMultiplier = MathLibrary.multiply(two, a);         // 2 * a
        int nMinusOne = MathLibrary.subtract(n, 1);                     // n - 1
        int commonDifference = MathLibrary.multiply(nMinusOne, d);      // (n - 1) * d
        int sumOfTerms = MathLibrary.sum(firstTermMultiplier, commonDifference); // 2 * a + (n - 1) * d
        int nTimesSumOfTerms = MathLibrary.multiply(n, sumOfTerms);     // n * (2 * a + (n - 1) * d)
        int twoDivisor = 2;

        return MathLibrary.divide(nTimesSumOfTerms, twoDivisor);        // (n * (2 * a + (n - 1) * d)) / 2
    }

    // Geometric Series: sum of first n terms
    public static double calculateGeometricSeries(double a, double r, int n) {
        double rPowerN = MathLibrary.power(r, n);           // r^n
        double numerator = MathLibrary.subtract(1, (int)rPowerN); // 1 - r^n
        double denominator = MathLibrary.subtract(1, (int)r);    // 1 - r
        double product = MathLibrary.multiply((int)a, (int)numerator); // a * (1 - r^n)

        return MathLibrary.divide((int)product, (int)denominator);
    }

    // Harmonic Series: sum of first n terms
    public static double calculateHarmonicSeries(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double reciprocal = MathLibrary.divide(1, i); // 1 / i
            sum = MathLibrary.sum((int)sum, (int)reciprocal);       // sum + 1 / i
        }
        return sum;
    }

    // Binomial Coefficient: C(n, k)
    public static long calculateBinomialCoefficient(int n, int k) {
        return MathLibrary.combination(n, k);
    }

    // Permutation: P(n, k)
    public static long calculatePermutation(int n, int k) {
        return MathLibrary.permutation(n, k);
    }

    // Sum of Squares: sum of squares of first n natural numbers
    public static double calculateSumOfSquares(int n) {
        int nPlus1 = MathLibrary.sum(n, 1);                 // n + 1
        int twoNPlus1 = MathLibrary.sum(MathLibrary.multiply(2, n), 1); // 2n + 1
        int product = MathLibrary.multiply(n, MathLibrary.multiply(nPlus1, twoNPlus1)); // n * (n + 1) * (2n + 1)
        return MathLibrary.divide(product, 6);
    }

    // Sum of Cubes: sum of cubes of first n natural numbers
    public static double calculateSumOfCubes(int n) {
        int nPlus1 = MathLibrary.sum(n, 1);                 // n + 1
        double sum = MathLibrary.divide(MathLibrary.multiply(n, nPlus1), 2); // (n * (n + 1)) / 2
        return MathLibrary.power(sum, 2);                  // ((n * (n + 1)) / 2)^2
    }

    // GCD: greatest common divisor of two numbers
    public static int calculateGCD(int a, int b) {
        if (b == 0) return a;
        double quotient = MathLibrary.divide(a, b);            // a / b
        int product = MathLibrary.multiply((int)quotient, b);    // (a / b) * b
        int remainder = MathLibrary.subtract(a, product);   // a % b
        return calculateGCD(b, remainder);                  // GCD(b, a % b)
    }

    // LCM: least common multiple of two numbers
    public static double calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);                      // GCD(a, b)
        int product = MathLibrary.multiply(a, b);          // a * b
        return MathLibrary.divide((int)product, (int)gcd);           // (a * b) / GCD(a, b)
    }
}