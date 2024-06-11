

package operator;
import java.util.*;

public class Relational {
     public static void main(String args[])
     {
    	 Scanner sc = new Scanner(System.in);
    	 
         System.out.print("Enter the first number: ");
         int a = sc.nextInt();
  
         System.out.print("Enter the second number: ");
         int b = sc.nextInt();
         
    	 System.out.println("a==b ="+(a==b));
    	 System.out.println("a!=b ="+(a!=b));
    	 System.out.println("a>b ="+(a>b));
    	 System.out.println("a<b ="+(a<b));
    	 System.out.println("b>=a ="+(b>=a));
    	 System.out.println("b<=a ="+(b<=a));
     }
}
