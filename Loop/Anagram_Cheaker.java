// Anagram Checker: Write a program that checks whether two given strings are anagrams of each other (i.e., they have the same characters in a different order).

// package 3rd Year Training.Loop;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Cheaker{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove cases
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // lenth
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort 
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1, charArray2);
    }
}
