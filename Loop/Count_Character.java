// Count Characters in a String: Write a program that counts the number of occurrences of each character in a given string.
// package 3rd Year Training.Loop;

public class Count_Character {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        countCharacters(inputString);
    }

    public static void countCharacters(String inputString) {
        int[] characterCount = new int[256]; // Assuming ASCII characters

        for (char c : inputString.toCharArray()) {
            characterCount[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (characterCount[i] > 0) {
                System.out.println((char) i + ": " + characterCount[i]);
            }
        }
    }
}
