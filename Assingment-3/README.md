#JavaPattern.java
###Code:
~~~~
public class JavaPattern {
    public static void main(String[] args) {
        System.out.println("    J     A     V     V     A");
        System.out.println("    J    A A     V   V     A A");
        System.out.println("J   J   AAAAA     V V     AAAAA");
        System.out.println(" J J   A     A     V     A     A");
    }
}
#RectangleArea.java
###Code:
class RectangleArea {
    public static void main(String[] args) {
               if (args.length < 2) {
            System.out.println("Please provide both width and height as command line arguments.");
            return;
        }

               double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

               double area = width * height;

               System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area of Rectangle: " + area);
    }
}
#RhombusArea.java
###Code :

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
#TrapeziumArea.java
###Code :

~~~
