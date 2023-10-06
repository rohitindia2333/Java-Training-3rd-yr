import java.util.*;
public class discount_calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total bill amount: ");
        
        double totalBill = scanner.nextDouble();
        double discount = calculateDiscount(totalBill);
        double discountedAmount = totalBill - discount;
        
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Discounted Amount: $" + discountedAmount);
        
        scanner.close();
    }
    
    public static double calculateDiscount(double totalBill) {
        double discount = 0.0;
        
        if (totalBill >= 1000 && totalBill < 5000) {
            discount = totalBill * 0.05;
        } else if (totalBill >= 5000 && totalBill < 10000) {
            discount = totalBill * 0.10;
        } else if (totalBill >= 10000 && totalBill < 20000) {
            discount = totalBill * 0.15;
        } else if (totalBill >= 20000) {
            discount = totalBill * 0.25;
        }
        
        return discount;
    }
}

