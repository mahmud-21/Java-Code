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
