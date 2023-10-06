import java.util.*;

public class vovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        char character = scanner.next().charAt(0);
        
        if (isVowel(character)) {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is a consonant.");
        }
        
        scanner.close();
    }
    
    public static boolean isVowel(char character) {
        char lowerChar = Character.toLowerCase(character);
        
        return lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u';
    }
}
