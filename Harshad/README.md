# The Code for Task 01 
~~~
class Harshad {
    int number;

    Harshad(int n) {
        number = n;
    }

    public String displayInfo() {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        if (number % sum == 0) {
            return "Harshad Number. Sum = " + sum;
        } else {
            return "Not a Harshad Number";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Harshad n1 = new Harshad(89);
        System.out.println(n1.displayInfo());
    }
}
~~~
