# Factorion Number Program (Java)

## 📌 Overview

This Java program finds **Factorion numbers** within a user-defined range.

A **Factorion number** is a number that is equal to the **sum of the factorials of its digits**.

### ✅ Examples

* `1 → 1! = 1`
* `2 → 2! = 2`
* `145 → 1! + 4! + 5! = 1 + 24 + 120 = 145`

So, **1, 2, and 145** are Factorion numbers.

---

## 🧠 How the Program Works

The program:

1. Takes **lower bound** and **upper bound** as input from the user.
2. Checks each number in the range.
3. Calculates the **factorial of each digit**.
4. Adds them and compares with the original number.
5. Prints all Factorion numbers found in the range.

---

## 🧩 Classes Used

### 1️⃣ `FactorionChecker`

Contains helper methods:

* `factorial(int n)` → Calculates factorial of a digit
* `isFactorion(int number)` → Checks if a number is a Factorion
* `findFactorionsInRange(int lowerBound, int upperBound)` → Returns all Factorion numbers in the range

### 2️⃣ `FactorionNumber`

* Contains the `main()` method
* Handles user input
* Displays output

---

## ▶️ How to Run the Program

### 🔹 Step 1: Compile

```bash
javac FactorionNumber.java
```

### 🔹 Step 2: Run

```bash
java FactorionNumber
```

---
## Source Code
~~~
import java.util.Scanner;

class FactorionChecker {
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static boolean isFactorion(int number) {
        int originalNumber = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public static int[] findFactorionsInRange(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isFactorion(i)) {
                count++;
            }
        }
        
        int[] factorions = new int[count];
        int index = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isFactorion(i)) {
                factorions[index++] = i;
            }
        }
        
        return factorions;
    }
}

public class FactorionNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        
        if (lowerBound > upperBound) {
            System.out.println("Error: Lower bound must be less than or equal to upper bound.");
            scanner.close();
            return;
        }
        
        int[] factorions = FactorionChecker.findFactorionsInRange(lowerBound, upperBound);
        
        System.out.println("Factorion numbers in the range:");
        if (factorions.length == 0) {
            System.out.println("No factorion numbers found in the given range.");
        } else {
            for (int factorion : factorions) {
                System.out.println(factorion);
            }
        }
        
        scanner.close();
    }
}

~~~
## ⌨️ Sample Input

```
Enter the lower bound of the range: 1
Enter the upper bound of the range: 500
```

## 📤 Sample Output

```
Factorion numbers in the range:
1
2
145
```

---

## ⚠️ Input Validation

* If **lower bound > upper bound**, the program shows an error message and exits safely.

---

## 🚀 Features

* Beginner-friendly Java code
* Uses loops and functions cleanly
* Proper input validation
* Efficient range checking

---

## 🛠️ Possible Improvements

* Optimize by precomputing factorials (0–9)
* Use `ArrayList` instead of arrays
* Add support for large numbers

---

## 👨‍💻 Author

**Md. Mahmudur Rahman**

---


