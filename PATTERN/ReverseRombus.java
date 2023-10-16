import java.util.*;
public class ReverseRombus {
    
    public static void main(String[] args) {
        System.out.println("enter number  of lines");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
