import java.util.*;
public class week_day_cheak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        
        int dayNumber = scanner.nextInt();
        
        String dayOfWeek = getDayOfWeek(dayNumber);
        
        if (dayOfWeek != null) {
            System.out.println("Day of the week: " + dayOfWeek);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        
        scanner.close();
    }
    
    public static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return null;
        }
    }
}
