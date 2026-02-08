# Circle Area Calculator (Java)

## 📌 Overview

This Java program calculates the **area of a circle** using Object-Oriented Programming (OOP) concepts.

It consists of two classes:

* **`Circle`** → Represents a circle and handles radius validation and area calculation
* **`Main`** → Takes user input and demonstrates how the `Circle` class works

---

## 🧠 Concepts Used

* Class and Object
* Encapsulation (`private` data member)
* Constructor
* Getter and Setter methods
* Input handling using `Scanner`
* Mathematical calculation using `Math.PI`

---

## 🧩 Class Details

### 1️⃣ `Circle` Class

This class stores the radius of a circle and provides methods to work with it safely.

#### 🔹 Data Member

* `private double radius` → Stores the radius of the circle

#### 🔹 Constructor

* `Circle(double radius)`

  * Initializes the circle object
  * Calls `setRadius()` to validate the radius

#### 🔹 Methods

* `setRadius(double radius)`

  * Prevents negative radius values
  * Sets radius to `0` if an invalid value is given

* `getRadius()`

  * Returns the current radius

* `calculateArea()`

  * Calculates area using the formula:

  **Area = π × r²**

---

### 2️⃣ `Main` Class

This class contains the `main()` method and handles user interaction.

#### Responsibilities:

* Takes radius input from the user
* Creates a `Circle` object
* Displays the radius and area
* Tests the setter method with a new radius value

---

## ▶️ How to Run the Program

### 🔹 Step 1: Compile

```bash
javac Circle.java Main.java
```

### 🔹 Step 2: Run

```bash
java Main
```

---
## Source Code
~~~
public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative. Setting to 0.");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Circle Area Calculator ===");
        System.out.print("Enter the radius of the circle: ");
        double inputRadius = scanner.nextDouble();
        Circle myCircle = new Circle(inputRadius);
        System.out.println("\n--- Result ---");
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.printf("Area: %.2f\n", myCircle.calculateArea());
        System.out.println("\n[Testing Setter with new value 10.0]");
        myCircle.setRadius(10.0);
        System.out.println("New Radius: " + myCircle.getRadius());
        System.out.printf("New Area: %.2f\n", myCircle.calculateArea());
        scanner.close();
    }
}
~~~
## ⌨️ Sample Input

```
Enter the radius of the circle: 5
```

---

## 📤 Sample Output

```
=== Circle Area Calculator ===
Enter the radius of the circle: 5

--- Result ---
Radius: 5.0
Area: 78.54

[Testing Setter with new value 10.0]
New Radius: 10.0
New Area: 314.16
```

If a negative radius is entered:

```
Error: Radius cannot be negative. Setting to 0.
```

---

## 🚀 Features

* User-friendly console input
* Prevents invalid radius values
* Demonstrates real use of getter and setter
* Clean and beginner-friendly code

---

## 🛠️ Possible Improvements

* Add circumference calculation
* Add loop to calculate multiple circles
* Handle non-numeric input

---

## 👨‍💻 Author

**Md. Mahmudur Rahman**

---

Happy Coding ☕😊
