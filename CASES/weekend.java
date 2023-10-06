import java.util.*;

public class weekend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week (e.g., Monday, Tuesday, ...): ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println(day + " is a weekend day.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day of the week.");
        }

        scanner.close();
    }
}
