import java.util.Scanner;

public class Armstrong {

    // public static boolean isArmstrong(int number) {
    // int originalNumber, remainder, result = 0, n = 0;
    // originalNumber = number;

    // for (originalNumber = number; originalNumber != 0; originalNumber /= 10,
    // ++n);

    // originalNumber = number;

    // while (originalNumber != 0) {
    // remainder = originalNumber % 10;
    // result += Math.pow(remainder, n);
    // originalNumber /= 10;
    // }

    // return (result == number);
    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the number to cheak");
    // int number= sc.nextInt();

    // if (isArmstrong(number)) {
    // System.out.println(number + " is an Armstrong number.");
    // } else {
    // System.out.println(number + " is not an Armstrong number.");
    // }
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to cheak the Armstrong number : ");
        int number = sc.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += power(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
    // increasing a power
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
    // count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
