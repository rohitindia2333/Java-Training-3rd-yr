import java.util.*;
public class Sum_of_Digit {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;  
            number /= 10;      
        }
        return sum;
    }
}
