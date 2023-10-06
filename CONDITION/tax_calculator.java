import java.util.*;
public class tax_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        
        System.out.println("Income:" + income);
        System.out.println("Tax: " + tax);
        
        scanner.close();
    }
    
    public static double calculateTax(double income) {
        double tax = 0.0;
        
        if (income < 10000) {
            tax = 0;
        } else if (income >= 10000 && income < 20000) {
            tax = (income - 10000) * 0.10;
        } else if (income >= 20000 && income < 30000) {
            tax = 10000 * 0.10 + (income - 20000) * 0.15;
        } else {
            tax = 10000 * 0.10 + 10000 * 0.15 + (income - 30000) * 0.25;
        }
        
        return tax;
    }
}
