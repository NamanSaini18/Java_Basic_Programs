// Simple JAVA program to understand the Conditional statements - (if,else else if , switch, break)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if((age > 18) || (age == 18)) {
		    System.out.println("You are eligible for Driving");
		}
		    else {
	        System.out.println("You are not eligible for Driving");
	    }
	        
	    
		
	}
}
