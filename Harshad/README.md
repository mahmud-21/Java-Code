# 🔢 Harshad Number 

## 📚 What is a Harshad Number?

A **Harshad Number** (also called *Niven number* or *multidigital number*) is a positive integer that is **divisible by the sum of its digits**.

**Example:**
- `18` → Sum of digits = `1 + 8 = 9` → `18 % 9 == 0` → ✅ Harshad Number
- `89` → Sum of digits = `8 + 9 = 17` → `89 % 17 != 0` → ❌ Not a Harshad Number

### The First Few Harshad Numbers
```
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, ...
```
*Sequence: [OEIS A005349](https://oeis.org/A005349)*

---

## 🌟 All-Harshad Numbers (Special Case)

An **all-Harshad number** is divisible by the sum of its digits **in ALL bases** `n >= 2`.

> **🔍 Only four such numbers exist:** `1, 2, 4, and 6`

---

## 💻 Problem Solutions

### 🎯 Task 01: Basic Harshad Checker (Class-Based)

A simple Java class to check if a number is Harshad.

```java
class Harshad {
    int number;

    Harshad(int n) {
        number = n;
    }

    public String displayInfo() {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        if (number % sum == 0) {
            return "Harshad Number. Sum = " + sum;
        } else {
            return "Not a Harshad Number";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Harshad n1 = new Harshad(89);
        System.out.println(n1.displayInfo());
    }
}
```

**Output:**
```
Not a Harshad Number
```

---

### 🎯 Task 02: LeetCode Solution [#3090](https://leetcode.com/problems/harshad-number/)

Returns the sum of digits if it's a Harshad number, otherwise `-1`.

```java
import java.util.Scanner;

public class Main {

    // Method to check Harshad number
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int y = x;

        while (y > 0) {
            int r = y % 10;
            sum += r;
            y = y / 10;
        }

        if (x % sum == 0)
            return sum;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();  // take input

        int result = sumOfTheDigitsOfHarshadNumber(x);

        System.out.println(result);

        sc.close();
    }
}
```

**Problem Link:** [leetcode.com/problems/harshad-number](https://leetcode.com/problems/harshad-number/)

---

### 🎯 Task 03: SPOJ Solution [HARSHAD](https://www.spoj.com/problems/HARSHAD/)

For competitive programming - handles multiple test cases efficiently.

```java
import java.util.Scanner;

public class HarshadSPOJ {
    
    public static boolean isHarshad(int num) {
        if (num <= 0) return false;
        
        int sum = 0;
        int temp = num;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        return num % sum == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(isHarshad(num) ? "YES" : "NO");
        }
        
        sc.close();
    }
}
```

**Problem Link:** [spoj.com/problems/HARSHAD](https://www.spoj.com/problems/HARSHAD/)

---

## 🚀 How to Run

### Compile & Execute
```bash
# For any task
javac Main.java
java Main
```

### Input Format
- **Task 01**: Modify the number in the constructor `new Harshad(89)`
- **Task 02**: Single integer input from console
- **Task 03**: Multiple integers (one per line) until EOF

---

## 📊 Sample Input/Output

| Input | Output | Explanation |
|-------|--------|-------------|
| `18` | `Harshad Number. Sum = 9` | 18 ÷ 9 = 2 |
| `89` | `Not a Harshad Number` | 89 ÷ 17 = 5.23... |
| `10` | `1` | 1+0=1, 10÷1=10 → returns sum |
| `13` | `-1` | 1+3=4, 13÷4=3.25 → returns -1 |

---

## 🔍 Interesting Mathematical Facts

| Property | Details |
|----------|---------|
| **Maximum Consecutive Sequence** | No more than **20** consecutive Harshad numbers exist |
| **Smallest 20-Consecutive Sequence** | Each number has **44,363,342,786 digits** |
| **n-Harshad Numbers** | Divisible by digit sum in base `n>=2` |
| **Infinite Sequences** | For base `2` or `3`, infinite sequences of length `2n` exist (Cai 1996) |

---

## 📖 References

- **MathWorld:** [Harshad Number](https://mathworld.wolfram.com/HarshadNumber.html)
- **OEIS:** [Sequence A005349](https://oeis.org/A005349)
- **Research:** Grundman (1994), Cai (1996)
- **Problems:** [LeetCode #3090](https://leetcode.com/problems/harshad-number/), [SPOJ HARSHAD](https://www.spoj.com/problems/HARSHAD/)

---

<div align="center">

**Happy Coding!** 🎉 | **Keep Solving!** 💪 | **Math is Fun!** 🧮

</div>
