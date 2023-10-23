import java.util.*;
public class Square_Root {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squareRoot = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);
    }
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            System.out.println("Square root is not defined for negative numbers.");
            return -1; 
        } else {
            return Math.sqrt(number);
        }
    }
}
