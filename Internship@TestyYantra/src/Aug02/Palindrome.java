package Aug02;

import java.util.Scanner;

// Read Number from Console and Check if it is a Palindrome String..?
public class Palindrome {
	
	public static void main(String[] args) {
		
		String str2;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String to check if it is a Palindrome..?");
		String strVal=input.nextLine();

		StringBuffer sb=new StringBuffer(strVal);
		str2=sb.reverse().toString();
		
		if(strVal.equals(str2))
		{
			System.out.println("Entered String is a Palindrome..."); 
		}
		else
		{
			System.out.println("Entered String is not a Palindrome..."); 
		}
	}
}
