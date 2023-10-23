//  A Insurance Company have a following polices (Insurance Premium Calculation program)
// 		User Input :
//                     a. Person Name
//                     b. Person gender
//                     c. Person Age
//                     d. Person city (Metro or Non-Metro)
// 	Conditions:
// 		if person age is 25 to 35 and gender is male and city is metro , Output is Premium is 6%
// 		if person age is 25 to 40 and gender is male and city is non-metro, Output is Premium 4%
// 		if person age is 25 to 42 and gender is female and city is Metro, Output is Premium 3%
// 		if person age is 25 to 45 and gender is female and city is non-metro , output is Premium 2%
// 		else
//  		Not Insured
import java.util.*;
public class Insurance_Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Person Name: ");
        String personName = scanner.nextLine();
        System.out.print("Enter Person Gender (male/female): ");
        String gender = scanner.nextLine();
        System.out.print("Enter Person Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Person City (Metro/Non-Metro): ");
        String city = scanner.nextLine();
        double premium = calculateInsurancePremium(age, gender, city);
        if (premium >= 0) {
            System.out.println("Premium for " + personName + " is " + premium + "%");
        } else {
            System.out.println("Not Insured.");
        }

        scanner.close();
    }

    public static double calculateInsurancePremium(int age, String gender, String city) {
        if (age >= 25 && age <= 35 && gender.equalsIgnoreCase("male") && city.equalsIgnoreCase("metro")) {
            return 6.0;
        } else if (age >= 25 && age <= 40 && gender.equalsIgnoreCase("male") && city.equalsIgnoreCase("non-metro")) {
            return 4.0;
        } else if (age >= 25 && age <= 42 && gender.equalsIgnoreCase("female") && city.equalsIgnoreCase("metro")) {
            return 3.0;
        } else if (age >= 25 && age <= 45 && gender.equalsIgnoreCase("female") && city.equalsIgnoreCase("non-metro")) {
            return 2.0;
        } else {
            return -1.0; 
        }
    }
}
