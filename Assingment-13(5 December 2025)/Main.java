import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Circle Area Calculator ===");
        
        // Taking input
        System.out.print("Enter the radius of the circle: ");
        double inputRadius = scanner.nextDouble();

        // 4. Creating Object using Constructor
        Circle myCircle = new Circle(inputRadius);

        // Displaying Area
        System.out.println("\n--- Result ---");
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.printf("Area: %.2f\n", myCircle.calculateArea());

        // Demonstrating Setter
        System.out.println("\n[Testing Setter with new value 10.0]");
        myCircle.setRadius(10.0);
        System.out.println("New Radius: " + myCircle.getRadius());
        System.out.printf("New Area: %.2f\n", myCircle.calculateArea());

        scanner.close();
    }
}
