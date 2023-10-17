import java.util.Scanner;

public class Salery_fixture {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the salery amount");
            double income = sc.nextDouble();
    
            double tax = calculateIncomeTax(income);
            System.out.println("Income: " + income);
            System.out.println("Income Tax: " + tax);
        }
    
        public static double calculateIncomeTax(double income) {
            if (income < 10000) {
                return 0; 
            } else if (income >= 10000 && income < 20000) {
                return (income - 10000) * 0.10; 
            } else if (income >= 20000 && income < 30000) {
                return 1000 + (income - 20000) * 0.15; 
            } else {
                return 2500 + (income - 30000) * 0.25; 
            }
        }
    }
    
