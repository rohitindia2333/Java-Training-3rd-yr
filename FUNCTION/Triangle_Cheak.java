import java.util.*;
public class Triangle_Cheak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        String triangleType = classifyTriangle(side1, side2, side3);

        System.out.println("The triangle is " + triangleType + " triangle.");

        scanner.close();
    }

    public static String classifyTriangle(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
