import java.util.Scanner;

public class swapping_no {
    public static void main(String[] args) {
         int x, y;
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       x=x+y;
       y=x-y;
       x=x-y;
       System.out.println("After swapping: "+ x +"   " + y);  
       System.out.println( );  
    }    
}  
    