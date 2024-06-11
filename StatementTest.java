package statement;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      String answer;
	 
      do {   
	   Scanner sc=new Scanner(System.in);
       System.out.println("Curiosity is the starting point for great adventure");
       
       System.out.println("Enter the Quantity:");
       int quantity=sc.nextInt();
       
       System.out.println("Enter the price:");
       int price=sc.nextInt();
       
       double total=quantity*price;
       System.out.println("Total is:"+total);
       
       System.out.println("**********************************");
       
       System.out.println("Do you want to perform again(Yes/No)?:");
       answer=sc.next();
      }while(answer.equals("Yes"));
      
      System.out.println("Completed...");
       
       
	}

}