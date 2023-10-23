import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        double percentage = scanner.nextDouble();
        char grade = calculateGrade(percentage);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
