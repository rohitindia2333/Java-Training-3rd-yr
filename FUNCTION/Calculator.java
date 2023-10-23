import java.util.Scanner;

public class Calculator {
    static int add(int x, int y) {
        int res = x + y;
        return res;
    }

    static int sub(int x, int y) {
        int res = x - y;
        return res;
    }

    static int mul(int x, int y) {
        int res = x * y;
        return res;
    }

    static int div(int x, int y) {
        int res = x / y;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for performing any operation");
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for divison");
        int a = sc.nextInt();
        System.out.println("enter  the First number");
        int x = sc.nextInt();
        System.out.println("Enter the Second Number");
        int y = sc.nextInt();

        if (a == 1) {
            System.out.println(add(x, y));
        }
        if (a == 2) {
            System.out.println(sub(x, y));
        }
        if (a == 3) {
            System.out.println(mul(x, y));
        }
        if (a == 4) {
            System.out.println(div(x, y));
        }
        sc.close();
    }
}