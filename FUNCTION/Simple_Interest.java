import java.util.*;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("Simple Interest: " + simpleInterest);
    }

    // calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {

        rate = rate / 100;

        double interest = (principal * rate * time);
        return interest;
    }
}
