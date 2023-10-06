// Prime Number: Write a Java program to check if a given number is prime or not using loops and conditional statements. 
// package 3rd Year Training.Loop;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter prime_number");
        n = sc.nextInt();

        int i, m = 0, flag = 0;

        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        } 
    }
}
