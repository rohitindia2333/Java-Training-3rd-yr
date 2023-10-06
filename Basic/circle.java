import java.util.Scanner;

public class circle {
     public static void main(String[] args) {
         int r;
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the radius of the circle");  
       r = sc.nextInt();  
       double area=3.14*r*r;
       System.out.println("area of circle"+area);
     }  
}
