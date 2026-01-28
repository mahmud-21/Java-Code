
# 👨‍💼 Employee Salary Calculation (Java – Inheritance & Polymorphism)

This Java program demonstrates **Inheritance**, **Method Overriding**, and **Runtime Polymorphism** using an employee salary calculation example.

A superclass `Employee` defines a common method `calculateSalary()`, which is overridden by two subclasses:
- `FullTimeEmployee`
- `PartTimeEmployee`

The program uses a **superclass reference** to call overridden methods at runtime.

---

## 📌 Features

- Demonstrates **Inheritance** in Java
- Uses **Method Overriding**
- Shows **Runtime Polymorphism**
- Clean and beginner-friendly code
- Console-based Java application

---

## 🛠️ Technologies Used

- **Java (JDK 8 or higher)**
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

EmployeeSalary/
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
## 🧾 Source Code
~~~
class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(50000);
        Employee emp2 = new PartTimeEmployee(500, 40);

        System.out.println("Full-Time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + emp2.calculateSalary());
    }
}
~~~
## 🧑‍💻 Sample Output
Full-Time Employee Salary: 50000.0
Part-Time Employee Salary: 20000.0

## 📚 OOP Concepts Used
~~~
🔹 Inheritance

  -->FullTimeEmployee and PartTimeEmployee inherit from Employee

🔹 Method Overriding

  -->calculateSalary() is overridden in both subclasses

🔹 Runtime Polymorphism

  -->Achieved using a superclass reference
~~~



































