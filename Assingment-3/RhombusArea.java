
class RhombusArea {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide both diagonals (d1 and d2) as command line arguments.");
            return;
        }
        double d1 = Double.parseDouble(args[0]);
        double d2 = Double.parseDouble(args[1]);
        double area = (d1 * d2) / 2;
        System.out.println("Diagonal 1: " + d1);
        System.out.println("Diagonal 2: " + d2);
        System.out.println("Area of Rhombus: " + area);
    }
}
