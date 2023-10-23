import java.util.*;
public class Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        checkPositiveNegative(number);
        
        scanner.close();
    }

    public static void checkPositiveNegative(double number) {
        if (number > 0) {
            System.out.println("The entered number is positive.");
        } else if (number < 0) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }
    }
}
