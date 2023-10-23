public class Swapping {
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        swapWithoutTemp(num1, num2);

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }

    // Function to swap two numbers without a third variable
    public static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    
    }
}
