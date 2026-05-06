# Harshad Number
## The Question for Harshad Problem
~~
A positive integerLinks to an external site. which is divisibleLinks to an external site. by the sum of its digitsLinks to an external site., also called a Niven number (Kennedy et al. 1980) or a multidigital number (Kaprekar 1955). The first few are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, ... (OEIS A005349Links to an external site.). Grundman (1994) proved that there is no sequence of more than 20 consecutive Harshad numbers, and found the smallest sequence of 20 consecutive Harshad numbers, each member of which has 44363342786 digits.

Grundman (1994) defined an n-Harshad (or n-Niven) number to be a positive integerLinks to an external site. which is divisibleLinks to an external site. by the sum of its digits in base n>=2. Cai (1996) showed that for n=2 or 3, there exists an infinite family of sequences of consecutive n-Harshad numbers of length 2n.

Define an all-Harshad (or all-Niven) number as a positive integer which is divisible by the sum of its digits in all bases n>=2. Then only 1, 2, 4, and 6 are all-Harshad numbers.
~~

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
# The link of Task o2
~~~
https://leetcode.com/problems/harshad-number/
~~~
# The code of Task 02
~~~
import java.util.Scanner;

public class Main {

    // Method to check Harshad number
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int y = x;

        while (y > 0) {
            int r = y % 10;
            sum += r;
            y = y / 10;
        }

        if (x % sum == 0)
            return sum;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();  // take input

        int result = sumOfTheDigitsOfHarshadNumber(x);

        System.out.println(result);

        sc.close();
    }
}
~~~
# The link of Task 03
~~~
https://www.spoj.com/problems/HARSHAD/
~~~
