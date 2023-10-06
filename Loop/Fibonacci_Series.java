
// Fibonacci Series: Write a program to generate the Fibonacci series up to a specified number of terms using a loop (e.g., 0, 1, 1, 2, 3, 5, 8, ...).
// package 3rd Year Training.Loop;
import java.util.*;

public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}
