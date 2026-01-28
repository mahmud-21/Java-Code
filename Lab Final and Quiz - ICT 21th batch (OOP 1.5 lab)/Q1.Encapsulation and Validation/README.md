# 🎓 Student Class Program in Java (Encapsulation)

This Java program demonstrates **Object-Oriented Programming (OOP)** concepts, especially **Encapsulation**.  
A `Student` class is created with private data members and public getter and setter methods.  
The program also validates CGPA values to ensure they stay within an acceptable range.

---

## 📌 Features

- Demonstrates **Encapsulation**
- Uses private variables with public getters and setters
- Validates CGPA (must be between 0.0 and 4.0)
- Simple console-based Java program
- Beginner-friendly and well-structured code

---

## 🛠️ Technologies Used

- **Java (JDK 8 or higher)**
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

StudentProject/
│
├── Main.java
└── README.md

> Both `Student` and `Main` classes are written in the same file for simplicity.

---

## ▶️ How to Run the Program

### 1️⃣ Compile the program
~~~
javac Main.java
~~~
### Run the Program
~~~
java Main
~~~
## Source Code
~~~
class Student {
    private int id;
    private String name;
    private double cgpa;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! CGPA must be between 0.0 and 4.0");
        }
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId(101);
        s1.setName("Azhar");
        s1.setCgpa(3.75);

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("CGPA: " + s1.getCgpa());

        // Testing invalid CGPA
        s1.setCgpa(5.0);
    }
}
~~~
