package Jul28;



//1) Write a program in Java to check if a number is even or odd in Java?
import java.util.Scanner;

public class NosEvenorOdd {
	
	public static void main(String[] args) {
		
	    int num;
	    
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt(); // Initialisation of given number is done

	    /* If number is divisible by 2 then it's an even number else odd number*/
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }
	}
	
