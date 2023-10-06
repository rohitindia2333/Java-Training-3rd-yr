//Even or Odd: Write a Java program that prints all even and odd numbers in the given range
// package 3rd Year Training.Loop;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        int r,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number for the range: ");
        int num2 = sc.nextInt();
        System.out.print("\nDisplay the even numbers between " + num1 + " and " + num2 + " are :");
        for (i = num1; i <= num2; i++) {
            r = i % 2;
            if (r == 0)
                System.out.println(i);
        }
        System.out.print("\nDisplay the odd numbers between " + num1 + " and " + num2 + " are :");
        for (i = num1; i <= num2; i++) {
            r = i % 2;
            if (r == 1)
                System.out.println(i);
        }
    }
}
