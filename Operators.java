package operator;

import java.util.Scanner;

public class Operators {
	 public static void main(String args[])
     {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the first number: ");
	        int a = sc.nextInt();
	 
	        System.out.print("Enter the second number: ");
	        int b = sc.nextInt();
	        
    	 
    	//Relational operators
    	 System.out.println("Relational operators:");
    	 System.out.println("a==b ="+(a==b));
    	 System.out.println("a!=b ="+(a!=b));
    	 System.out.println("a>b ="+(a>b));
    	 System.out.println("a<b ="+(a<b));
    	 System.out.println("b>=a ="+(b>=a));
    	 System.out.println("b<=a ="+(b<=a));
    	 
    	 //Logical operators
    	    System.out.println("Logical operators :");
    	    System.out.print("Enter the third number: ");
	        boolean c = sc.nextBoolean();
            System.out.print("Enter the fourth number: ");
	        boolean d = sc.nextBoolean();
	    
    	 System.out.println("a&&b = "+(c&&d));
    	 System.out.println("a||b = "+(c||d));
    	 System.out.println("!(a&&b) = "+!(c&&d));
    	 
    	 System.out.println("Unary operators =");
 		System.out.println("b-- ="+(--b));
    	System.out.println("a++ ="+(++a));
 		System.out.println("b-- ="+(--b));
     }
}
