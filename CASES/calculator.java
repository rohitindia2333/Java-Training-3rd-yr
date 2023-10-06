import java.util. *;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1/2/3/4): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '1':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '2':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '3':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '4':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}

