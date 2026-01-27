import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first diagonal (d1): ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second diagonal (d2): ");
        double d2 = sc.nextDouble();
        double area = (d1 * d2) / 2;
        System.out.println("Area of Rhombus = " + area);
        sc.close();
    }
}
