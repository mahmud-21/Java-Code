public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative. Setting to 0.");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

