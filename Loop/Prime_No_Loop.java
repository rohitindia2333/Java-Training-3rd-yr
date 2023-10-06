// Print Prime Numbers: Write a program to print all prime numbers within a given range.
// package 3rd Year Training.Loop;
import java.util.*;
public class Prime_No_Loop {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower range: ");
        int n = scanner.nextInt();

        System.out.print("Enter the upper range: ");
        int m = scanner.nextInt();

        System.out.println("Prime numbers within the range " + n + " to " + m + ":");
        printPrimesInRange(n, m);

        scanner.close();
    }

    public static void printPrimesInRange(int n, int m) {
        for (int number = n; number <= m; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
