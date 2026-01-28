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
