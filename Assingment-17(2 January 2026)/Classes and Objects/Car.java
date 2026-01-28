class car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Car {
    public static void main(String[] args) {
        car myCar = new car(); 
        myCar.color = "Red";
        myCar.speed = 100;
        myCar.drive();
    }
}
