// count  the digit count in java
// package 3rd Year Training.Loop;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        int num ,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count digit");
         num = sc.nextInt();
          while (num != 0) {
                // num = num/10
                num /= 10;
                ++count;
              }
          
              System.out.println("Number of digits: " + count);
            }
          }