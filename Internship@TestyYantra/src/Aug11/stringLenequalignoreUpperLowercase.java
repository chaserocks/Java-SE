package Aug11;

// 4) Write a program to fetch 2 string input, Find the string length, equals(), equalsIgnorecase(), String to Lowercaser, uppercase ?
import java.util.Scanner;

public class stringLenequalignoreUpperLowercase {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a name..?");
	String in1=sc.nextLine();
	
	System.out.println("Enter another name..?");
	String in2=sc.nextLine();
	
	// length of the Strings of 2 String inputs:
	System.out.println(in1.length());
	
	System.out.println(in2.length());
	
	if(in1.equals(in2))
		System.out.println("Both inputs are same");
	else if(in1.equalsIgnoreCase(in2))
		System.out.println("Both inputs are not same");
	
	// UpperCase and LowerCase :
	
		System.out.println(in1.toLowerCase() + " "+in1.toUpperCase());
	
		System.out.println(in2.toUpperCase() + " "+in2.toLowerCase());
	}
}
