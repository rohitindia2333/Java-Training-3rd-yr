import java.util.Scanner;

public class rectangle {
     public static void main(String[] args) {
         int x, y;
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt(); 
       int area=2*(x+y); 
       System.out.println(area);
}
}