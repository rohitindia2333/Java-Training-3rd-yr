import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1/2): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            convertFahrenheitToCelsius();
        } else if (choice == 2) {
            convertCelsiusToFahrenheit();
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        
        scanner.close();
    }
    
    public static void convertFahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        
        System.out.println("Temperature in Celsius: " + celsius);
        
        scanner.close();
    }
    
    public static void convertCelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}
