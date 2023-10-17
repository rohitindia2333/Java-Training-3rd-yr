import java.util.Scanner;
public class Armstrong {

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n)
            ;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return (result == number);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to cheak");
        int number= scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
