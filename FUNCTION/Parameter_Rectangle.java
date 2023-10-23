import java.util.Scanner;

public class Parameter_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = calculateRectanglePerimeter(length, width);

        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
    public static double calculateRectanglePerimeter(double length, double width) {
        
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}

