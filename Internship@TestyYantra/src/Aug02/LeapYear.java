package Aug02;

// WAP to Determine If Year Is Leap Year Java?
import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter any year..?");
	int year=input.nextInt();
	
	if((year % 400==0) || ((year % 4 ==0) && (year % 100!=0)))
			
			System.out.println("Entered year " +year+ " is a Leap year");
	else
			System.out.println("Entered year " +year+ " is not a Leap year");
	 

	// Another Way: 

		  System.out.println("Enter any year..?");
		  int yr= input.nextInt();
		
	// If year is divisible by 4 then it is a leap year
		  
		 if(yr % 4 == 0)
		 {
			 System.out.println("year "+ yr + " is a leap year");
		 }
		 else
		 {
			 System.out.println("year "+ yr + " is not leap year");
		 }		
		
  }
}
