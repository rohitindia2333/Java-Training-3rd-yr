import java.util.Scanner;

public class Salery_fixture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = 2000;
        double grossSalary = basicSalary + hra + da + ta;

        double tax = calculateTax(grossSalary);

        double netSalary = grossSalary - tax;

        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }

    public static double calculateHRA(double basicSalary) {
        return 0.30 * basicSalary;
    }

    public static double calculateDA(double basicSalary) {
        return 0.20 * basicSalary;
    }

    public static double calculateTax(double grossSalary) {  //we consider 10% tax for each salery
        return 0.10 * grossSalary;
    }
}
