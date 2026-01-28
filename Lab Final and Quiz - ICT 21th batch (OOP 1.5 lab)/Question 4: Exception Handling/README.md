# ⚠️ Exception Handling in Java (Division Program)

This Java program demonstrates **Exception Handling** using `try`, `catch`, and `finally` blocks.  
The program takes two integers from the user, performs division, and properly handles runtime errors.

---

## 📌 Objectives

- Take two integers as input
- Perform division operation
- Handle `ArithmeticException` (division by zero)
- Handle `InputMismatchException` (invalid input)
- Use a `finally` block to display program completion message

---

## 🛠️ Technologies Used

- Java (JDK 8 or higher)
- Java Exception Handling
- `Scanner` class for user input

---

## 📂 Project Structure

ExceptionHandling/
│
├── Main.java
└── README.md

---

## ▶️ How to Run the Program

### 1️⃣ Compile the program
javac Main.java
### 2️⃣ Run the program
java Main
## 🧾 Source Code
~~~
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();

            System.out.print("Enter second integer: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only");
        }
        finally {
            System.out.println("Program Execution Completed");
        }

        sc.close();
    }
}
~~~
