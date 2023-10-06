import java.util.*;

public class season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month  ..January, February, ...: ");
        String month = scanner.nextLine().toLowerCase();

        switch (month) {
            case "december":
            case "january":
            case "february":
                System.out.println(month + " is in winter.");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println(month + " is in spring.");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println(month + " is in summer.");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println(month + " is in fall.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid month.");
        }

        scanner.close();
    }
}
