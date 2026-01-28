# 🔺 Shape Program in Java (Abstract Class vs Interface)

This Java program demonstrates the difference between an **Abstract Class** and an **Interface** using simple shape examples.

- An abstract class `Shape` defines a common structure for shapes.
- An interface `Drawable` defines a common behavior (drawing).
- `Circle` and `Rectangle` classes extend the abstract class and implement the interface.

---

## 📌 Objectives

- Understand **abstract classes**
- Understand **interfaces**
- Learn how both are used together
- Demonstrate **abstraction** in Java

---

## 🛠️ Technologies Used

- Java (JDK 8 or higher)
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

ShapeProgram/
│
├── Main.java
└── README.md

> All classes are written in a single file for simplicity.

---

## ▶️ How to Run the Program

### 1️⃣ Compile the program
javac Main.java
### 2️⃣ Run the program
java Main
### 🧾 Source Code
~~~
interface Drawable {
    void draw();
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());

        Drawable d1 = new Circle(3);
        Drawable d2 = new Rectangle(2, 5);

        d1.draw();
        d2.draw();
    }
}
~~~
### 🧑‍💻 Sample Output
Circle Area: 78.5

Rectangle Area: 24.0

Drawing a Circle

Drawing a Rectangle

