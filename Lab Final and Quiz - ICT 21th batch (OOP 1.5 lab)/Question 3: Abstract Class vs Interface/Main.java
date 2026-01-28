interface Drawable {
    void draw();
}
abstract class Shape {
    abstract double area();
}
class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape implements Drawable {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());

        Drawable d1 = new Circle(3);
        Drawable d2 = new Rectangle(2, 5);

        d1.draw();
        d2.draw();
    }
}


