# 🔄 Reverse Array (Java)

A simplified Java program that reverses the elements of an array of floating-point numbers (`double`). It uses an efficient **in-place** reversal algorithm, meaning it swaps elements directly within the existing array without creating a new one, saving memory.

## 🚀 Features

* **In-Place Reversal:** Uses the "Two-Pointer" technique to reverse the array with $O(1)$ space complexity.
* **Double Precision:** Handles decimal numbers (`double`), not just integers.
* **User Input:** Dynamically accepts array size and elements via standard input.

## 📜 The Source Code

Save the following code in a file named `ReverseArray.java`:

```java
import java.util.Scanner;

public class ReverseArray {

    public static void reverse(double[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            double temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }l
        reverse(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }

        sc.close();
    }
}
