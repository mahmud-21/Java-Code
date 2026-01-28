# 📘 SeriesSum (Java Program)

## 📌 Description
This Java program calculates the **sum of a series of natural numbers** from `1` to `n`.

The user provides a value for `n`, and the program computes the sum:

1 + 2 + 3 + ... + n

This program is ideal for beginners who are learning:
- Loops in Java
- User input using `Scanner`
- Basic arithmetic operations

---

## 🧠 How the Program Works
1. The program asks the user to enter a number `n`.
2. It initializes a variable `sum` with value `0`.
3. A `for` loop runs from `1` to `n`.
4. Each number is added to `sum`.
5. Finally, the total sum is displayed.

---

## 🛠️ Technologies Used
- **Programming Language:** Java  
- **Library:** `java.util.Scanner`

---

## ▶️ How to Run the Program

### Step 1: Compile the program

javac SeriesSum.java

---

### Step 2 Run the program

java SeriesSum

### Sample Input
Enter the value of n: 5
### Sample Output
The sum of the series 1 + 2 + ... + 5 is: 15

---
## Source Code 
~~~
import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the series 1 + 2 + ... + " + n + " is: " + sum);
    }
}

~~~
















