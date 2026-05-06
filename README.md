# Java-Code
<div align="center">
# 🔢 Harshad Number
**An interactive study of Harshad (Niven) Numbers — implementations, theory, and problem solutions**
<br>
[![Number Theory](https://img.shields.io/badge/Mathematics-Number_Theory-9B59B6?style=for-the-badge&logo=bookstack&logoColor=white)](https://en.wikipedia.org/wiki/Number_theory)
[![Java](https://img.shields.io/badge/Java-Solutions-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![LeetCode](https://img.shields.io/badge/LeetCode-Harshad_Number-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/problems/harshad-number/)
[![SPOJ](https://img.shields.io/badge/SPOJ-HARSHAD-3498DB?style=for-the-badge&logo=sphere-online-judge&logoColor=white)](https://www.spoj.com/problems/HARSHAD/)
<br>
> 💡 *"A positive integer which is divisible by the sum of its digits"*
>
> — D. R. Kaprekar, 1955
<br>
<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=12&height=3&section=footer" width="100%" />
</div>
---
## 📑 Table of Contents
- [📖 What is a Harshad Number?](#-what-is-a-harshad-number)
- [📝 Task Implementations](#-task-implementations)
  - [Task 01 — OOP Harshad Class](#task-01--oop-harshad-class)
  - [Task 02 — LeetCode Problem](#task-02--leetcode-problem)
  - [Task 03 — SPOJ Problem](#task-03--spoj-problem)
- [🧠 Theory & Mathematical Facts](#-theory--mathematical-facts)
- [⚙️ Algorithm Explained](#️-algorithm-explained)
- [📊 Key Theorems & Results](#-key-theorems--results)
- [📚 References](#-references)
---
## 📖 What is a Harshad Number?
A **Harshad number** (also called a **Niven number** or **multidigital number**) is a positive integer that is **divisible by the sum of its own digits**.
> From Sanskrit: **Harshad** = *"great joy"* → numbers that bring joy through divisibility! 🎉
**The first few Harshad numbers:**
```
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, ...
```
> 📌 **OEIS Sequence:** [A005349](https://oeis.org/A005349)
**Examples:**
| Number | Digit Sum | Division | Harshad? |
|:------:|:---------:|:--------:|:--------:|
| `18` | 1 + 8 = **9** | 18 ÷ 9 = **2** | ✅ Yes |
| `21` | 2 + 1 = **3** | 21 ÷ 3 = **7** | ✅ Yes |
| `89` | 8 + 9 = **17** | 89 ÷ 17 = **5.235…** | ❌ No |
| `1729` | 1+7+2+9 = **19** | 1729 ÷ 19 = **91** | ✅ Yes |
<br>
---
## 📝 Task Implementations
### Task 01 — OOP Harshad Class
> 🎯 **Goal:** Create an object-oriented Java class to check Harshad numbers
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
> 💡 **Key Concepts:** Encapsulation, constructor, digit extraction using modulo (`%`) operator
<br>
---
### Task 02 — LeetCode Problem
> 🎯 **Goal:** Solve the [LeetCode — Harshad Number](https://leetcode.com/problems/harshad-number/) problem
![LeetCode](https://img.shields.io/badge/Difficulty-Easy-green?style=flat-square)
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
**Sample Input / Output:**
| Input | Output | Explanation |
|:-----:|:------:|-------------|
| `18` | `9` | 1+8=9, 18÷9=2 ✅ → returns digit sum |
| `23` | `-1` | 2+3=5, 23÷5=4.6 ❌ → returns -1 |
<br>
---
### Task 03 — SPOJ Problem
> 🎯 **Goal:** Solve the [SPOJ — HARSHAD](https://www.spoj.com/problems/HARSHAD/) problem
![SPOJ](https://img.shields.io/badge/Difficulty-Competitive_Programming-red?style=flat-square)
**Approach:**
1. Apply the same digit-sum and divisibility logic
2. Consider **performance optimizations** for large inputs
3. Handle **multiple test cases** efficiently
4. Time Complexity: `O(log₁₀ n)` per number
**Pseudocode:**
```
function sumOfTheDigitsOfHarshadNumber(x):
    sum ← 0
    y ← x
    while y > 0:
        r ← y mod 10
        sum ← sum + r
        y ← y div 10
    if x mod sum = 0:
        return sum
    else:
        return -1
```
<br>
---
## 🧠 Theory & Mathematical Facts
### 📐 What makes it special?
<table>
<tr>
<td width="30%" align="center">
🖼️ **Definition**
</td>
<td>
A positive integer divisible by the sum of its digits, also called a <strong>Niven number</strong> (Kennedy et al. 1980) or a <strong>multidigital number</strong> (Kaprekar 1955).
</td>
</tr>
<tr>
<td align="center">
🌟 **All-Harshad Numbers**
</td>
<td>
An <strong>all-Harshad</strong> (or all-Niven) number is divisible by the sum of its digits in <em>all</em> bases n ≥ 2.
<br><br>
🏆 <strong>Only 4 exist:</strong> <code>1</code>, <code>2</code>, <code>4</code>, and <code>6</code>
</td>
</tr>
<tr>
<td align="center">
🌐 **n-Harshad Numbers**
</td>
<td>
An <strong>n-Harshad</strong> (or n-Niven) number is divisible by the sum of its digits in base n ≥ 2. Cai (1996) showed infinite families of consecutive 2-Harshad and 3-Harshad numbers exist.
</td>
</tr>
</table>
<br>
---
## ⚙️ Algorithm Explained
### Step-by-Step
```
Step 1️⃣  →  Initialize sum = 0
Step 2️⃣  →  Extract the last digit: digit = number % 10
Step 3️⃣  →  Add to sum: sum = sum + digit
Step 4️⃣  →  Remove last digit: number = number / 10
Step 5️⃣  →  Repeat steps 2–4 until number becomes 0
Step 6️⃣  →  Check if original_number % sum == 0
```
### Complexity Analysis
| Metric | Value |
|--------|-------|
| ⏱️ **Time Complexity** | `O(log₁₀ n)` — proportional to number of digits |
| 💾 **Space Complexity** | `O(1)` — constant extra space |
<br>
---
## 📊 Key Theorems & Results
| 📜 Theorem | 👤 Author | 📅 Year | 📝 Result |
|------------|-----------|:-------:|-----------|
| Coined "Niven number" | Kennedy et al. | 1980 | Popularized the concept at a mathematics conference |
| Consecutive Harshad limit | Grundman | 1994 | Max **20** consecutive Harshad numbers can exist |
| Smallest 20-sequence | Grundman | 1994 | Each member has **4,436,334,2786** digits! |
| Infinite n-Harshad families | Cai | 1996 | Infinite consecutive sequences for bases 2 and 3 |
<br>
---
## 📚 References
| # | Reference | Link |
|:-:|-----------|------|
| 1 | **OEIS A005349** — Harshad numbers | [oeis.org/A005349](https://oeis.org/A005349) |
| 2 | **Wikipedia** — Harshad number | [en.wikipedia.org](https://en.wikipedia.org/wiki/Harshad_number) |
| 3 | **MathWorld** — Harshad Number | [mathworld.wolfram.com](https://mathworld.wolfram.com/HarshadNumber.html) |
| 4 | **LeetCode** — Harshad Number Problem | [leetcode.com/problems/harshad-number](https://leetcode.com/problems/harshad-number/) |
| 5 | **SPOJ** — HARSHAD Problem | [spoj.com/problems/HARSHAD](https://www.spoj.com/problems/HARSHAD/) |
| 6 | Kennedy, R. E. et al. (1980) | *Coined "Niven number"* |
| 7 | Kaprekar, D. R. (1955) | *Defined "multidigital numbers"* |
| 8 | Grundman, H. G. (1994) | *Sequences of consecutive n-Niven numbers* |
| 9 | Cai, T. (1996) | *On 2-Niven and 3-Niven numbers* |
<br>
---
<div align="center">
<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=12&height=3&section=footer" width="100%" />
<br>
### Made with ❤️ and ☕
**Harshad Number** — Exploring the beauty of Number Theory
[⬆ Back to Top](#-harshad-number)
</div>

