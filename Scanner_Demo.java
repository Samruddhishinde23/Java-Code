
package operator;
import java.util.*;

public class Scanner_Demo {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enetr the Age:");
    	 int age=sc.nextInt();
    	 
    	
    	 
    	 System.out.println("Age of Sam is:"+age);
    	 
    	 if(age>=18) {
    		 System.out.println("Eligible for voting");	 
    	 }else {
    		 System.out.println("Not eligible for voting");
    	 }
     }
}