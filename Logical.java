package operator;

import java.util.Scanner;

public class Logical {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
    	 
         System.out.print("Enter the first number: ");
         boolean a = sc.nextBoolean();
  
         System.out.print("Enter the second number: ");
         boolean b = sc.nextBoolean();
    	 System.out.println("a&&b = "+(a&&b));
    	 System.out.println("a||b = "+(a||b));
    	 System.out.println("!(a&&b) = "+!(a&&b));
    	 
     }
}
