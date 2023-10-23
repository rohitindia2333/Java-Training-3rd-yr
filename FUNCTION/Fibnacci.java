public class Fibnacci {
 public static void main(String[] args) {
        int n = 10; 
        System.out.println("Fibonacci series of " + n + " numbers:");
        printFibonacciSeries(n);
    }
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
