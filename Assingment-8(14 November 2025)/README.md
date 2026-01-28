# RandomNumberGenerator

**RandomNumberGenerator** is a custom Java utility class that implements a pseudo-random number generator (PRNG). Instead of using Java's built-in `Random` library, this class manually implements a **Linear Congruential Generator (LCG)** algorithm to produce random integers, longs, floats, and doubles.

## 🧮 The Algorithm

This generator uses the **Linear Congruential Generator (LCG)** method, which is one of the oldest and best-known algorithms for generating pseudo-random numbers.

The recursive formula used is:
$$X_{n+1} = (a \cdot X_n + c) \pmod m$$

Where:
* **$X$**: The sequence of pseudo-random values.
* **$m$ (Modulus)**: $2^{31}$ (`2147483648`).
* **$a$ (Multiplier)**: `1103515245`.
* **$c$ (Increment)**: `12345`.
* **Seed**: Initialized using `System.nanoTime()` for unpredictability.

---

## 🚀 Features

The class provides static methods to generate random numbers for various data types and ranges:

* **Integers:** Raw randoms, 0 to Max, or Min to Max.
* **Longs:** 0 to Max, or Min to Max.
* **Doubles:** 0.0 to Max, or Min to Max.
* **Floats:** 0.0 to Max, or Min to Max.

---

## 📂 Source Code

```java
public class RandomNumberGenerator {
    
    private static long seed = System.nanoTime();
    private static final long a = 1103515245L;
    private static final long c = 12345L;
    private static final long m = 2147483648L;
    
    private static void nextSeed() {
        seed = (a * seed + c) % m;
    }
    
    public static int generateRandom() {
        nextSeed();
        return (int) Math.abs(seed);
    }
    
    public static int generateRandom(int max) {
        nextSeed();
        return (int) (Math.abs(seed) % max);
    }
    
    public static int generateRandom(int min, int max) {
        return min + generateRandom(max - min);
    }
    
    public static double generateRandom(double d) {
        nextSeed();
        return (Math.abs(seed) / (double) m) * d;
    }
    
    public static double generateRandom(double min, double max) {
        nextSeed();
        return min + (Math.abs(seed) / (double) m) * (max - min);
    }
    
    public static float generateRandom(float max) {
        nextSeed();
        return (Math.abs(seed) / (float) m) * max;
    }
    
    public static float generateRandom(float min, float max) {
        nextSeed();
        return min + (Math.abs(seed) / (float) m) * (max - min);
    }
    
    public static long generateRandom(long l) {
        nextSeed();
        return Math.abs(seed) % l;
    }
    
    public static long generateRandom(long min, long max) {
        nextSeed();
        return min + Math.abs(seed) % (max - min);
    }
}
