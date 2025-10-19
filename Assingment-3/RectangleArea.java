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

