# CGPACalculator

**CGPACalculator** is a Java command-line application designed to compute a student's Cumulative Grade Point Average (CGPA). It accepts marks for multiple courses, converts them into grade points based on a standard grading scale, and calculates the weighted average.

## 📋 Overview

The program performs the following steps:
1.  Accepts **Student ID** and the **number of courses**.
2.  Iterates through each course to collect:
    * **Credit Hours** (e.g., 3.0 or 1.5).
    * **Marks Breakdown** (OOP, AAD, and NM components).
3.  Calculates the total marks and assigns a **Grade Point** (0.00 - 4.00).
4.  Computes the final **CGPA** and determines the overall **Letter Grade**.

---

## 📊 Grading Logic

The application uses the following scale to convert Total Marks (out of 100) into Grade Points and Letter Grades:

| Marks Range (%) | Grade Point | Letter Grade |
| :--- | :--- | :--- |
| **80 - 100** | 4.00 | A+ |
| **75 - 79** | 3.75 | A |
| **70 - 74** | 3.50 | A- |
| **65 - 69** | 3.25 | B+ |
| **60 - 64** | 3.00 | B |
| **55 - 59** | 2.75 | B- |
| **50 - 54** | 2.50 | C+ |
| **45 - 49** | 2.25 | C |
| **40 - 44** | 2.00 | D |
| **Below 40** | 0.00 | F |

---

## 🧮 Calculations

### 1. Total Marks Per Course
For every course, the total mark is the sum of three specific assessment components:
$$TotalMarks = OOP (30) + AAD (10) + NM (60)$$

* **OOP:** Object Oriented Program component (Max 30)
* **AAD:** Algorithms Analysis and Design component (Max 10)
* **NM:** Numerical Methods component (Max 60)

### 2. CGPA Formula
The Cumulative Grade Point Average is calculated using the weighted average formula:

$$CGPA = \frac{\sum (GradePoint \times Credit)}{\sum TotalCredits}$$

---

## 📂 Source Code

```java
import java.util.Scanner;

public class CGPACalculator {

    public static double getGradePoint(double totalMarks) {
        if (totalMarks >= 80) return 4.00;
        else if (totalMarks >= 75) return 3.75;
        else if (totalMarks >= 70) return 3.50;
        else if (totalMarks >= 65) return 3.25;
        else if (totalMarks >= 60) return 3.00;
        else if (totalMarks >= 55) return 2.75;
        else if (totalMarks >= 50) return 2.50;
        else if (totalMarks >= 45) return 2.25;
        else if (totalMarks >= 40) return 2.00;
        else return 0.00;
    }

    public static String getFinalGrade(double cgpa) {
        if (cgpa >= 4.00) return "A+";
        else if (cgpa >= 3.75) return "A";
        else if (cgpa >= 3.50) return "A-";
        else if (cgpa >= 3.25) return "B+";
        else if (cgpa >= 3.00) return "B";
        else if (cgpa >= 2.75) return "B-";
        else if (cgpa >= 2.50) return "C+";
        else if (cgpa >= 2.25) return "C";
        else if (cgpa >= 2.00) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("No. of Courses: ");
        int numCourses = sc.nextInt();

        double totalCreditsTaken = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");
            System.out.print("Credit (Max 3/6): ");
            double credit = sc.nextDouble();

            System.out.print("OOP (out of 30): "); //OOP:Object Oriented Program
            double OOP = sc.nextDouble();

            System.out.print("AAD (out of 10): "); //AAD:Algorithms Analysis and Design
            double AAD = sc.nextDouble();

            System.out.print("NM (out of 60): "); //NM:Numerical Methods
            double NM= sc.nextDouble();

            double totalMarks = OOP + AAD + NM;
            double gradePoint = getGradePoint(totalMarks);

            totalCreditsTaken += credit;
            totalGradePoints += (gradePoint * credit);
        }

        double cgpa = totalGradePoints / totalCreditsTaken;
        String finalGrade = getFinalGrade(cgpa);

        System.out.println("\n----------------------------------------");
        System.out.println("Student ID: " + studentID);
        System.out.println("Credit Taken: " + (int) totalCreditsTaken);
        System.out.println("Credit Earned: " + (int) totalCreditsTaken);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + finalGrade);
        System.out.println("----------------------------------------");
    }
}
