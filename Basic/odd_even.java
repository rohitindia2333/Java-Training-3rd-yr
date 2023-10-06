import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {

                String[] arr = {"Even", "Odd"};
         
                Scanner sc = new Scanner(System.in);
                 
                System.out.print("Enter the number: ");
                int no = sc.nextInt();
         
                System.out.println(arr[no%2]);
                
        }
}
