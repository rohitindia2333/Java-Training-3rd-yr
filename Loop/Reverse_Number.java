// Reverse a Number: Write a program to reverse a given number using loops.
// package 3rd Year Training.Loop;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
        input.close();
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }
        return reversedNumber;
    }
}
