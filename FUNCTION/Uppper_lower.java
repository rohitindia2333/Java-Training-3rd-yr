import java.util.Scanner;

public class Uppper_lower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String convertedString = convertCase(input);

        System.out.println("Converted string: " + convertedString);
    }

    // Function to convert case
    public static String convertCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); //same
            }
        }

        return result.toString();
    }
}
