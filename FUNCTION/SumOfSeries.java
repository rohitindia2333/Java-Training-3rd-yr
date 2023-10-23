import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);
        System.out.println("The sum of the series 12+22+32+...+n^2 is: " + sum);
    }

    public static int calculateSum(int n) {
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return -1;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
