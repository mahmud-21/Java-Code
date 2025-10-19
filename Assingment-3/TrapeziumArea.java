
class TrapeziumArea {
    public static void main(String[] args) {
                if (args.length < 3) {
            System.out.println("Please provide two parallel sides (a, b) and height (h) as command line arguments.");
            System.out.println("Example: java TrapeziumArea 5 7 4");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]); 
        double h = Double.parseDouble(args[2]); 
        double area = 0.5 * (a + b) * h;
        System.out.println("First parallel side (a): " + a);
        System.out.println("Second parallel side (b): " + b);
        System.out.println("Height (h): " + h);
        System.out.println("Area of Trapezium: " + area);
    }
}
