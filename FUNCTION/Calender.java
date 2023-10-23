import java.util.*;

public class Calender {
    public static void main(String[] args) {
        System.out.println("Days of the Week:");
        printDaysOfWeek();

        System.out.println("\nMonths of the Year:");
        printMonthsOfYear();
    }

    public static void printDaysOfWeek() {
        String[] daysOfWeek = {
                "Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};

        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println((i + 1) + ". " + daysOfWeek[i]);
        }
    }

    public static void printMonthsOfYear() {
        String[] monthsOfYear = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };

        for (int i = 0; i < monthsOfYear.length; i++) {
            System.out.println((i + 1) + ". " + monthsOfYear[i]);
        }
    }
}
