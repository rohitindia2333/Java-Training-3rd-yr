// Digit Sum.You are given an integer number, say 123 the output will be 1+2+3=6.
// package 3rd Year Training.Loop;

import java.util.Scanner;

public class Sum_Digit {
    public static void main(String[] args) {
        int n,result = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digit for counting the number of digits ");
        n=sc.nextInt();
                while (n > 0) {

            result = result + n % 10;

            n = n / 10;

        }

        System.out.println(result); 

}
    }