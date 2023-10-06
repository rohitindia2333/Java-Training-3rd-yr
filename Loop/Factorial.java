// Factorial: Write a program to calculate the factorial of a given number using a loop (e.g., 5! = 5 x 4 x 3 x 2 x 1).
// package 3rd Year Training.Loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of factorial");
        n=sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
    }
}

