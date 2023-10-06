
import java.util .*;

public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0; // Starting balance

        while (true) {
            System.out.println("Welcome to Simple ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using Simple ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
