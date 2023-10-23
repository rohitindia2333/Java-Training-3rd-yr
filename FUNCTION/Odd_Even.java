public class Odd_Even {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 100 are:");
        printEvenNumbers(1, 100);

        System.out.println("\nOdd numbers between 1 and 100 are:");
        printOddNumbers(1, 100);
    }

    public static void printEvenNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void printOddNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
