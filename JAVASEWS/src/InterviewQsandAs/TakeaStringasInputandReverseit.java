package InterviewQsandAs;

import java.util.Scanner;
// WAP to Take a String as Input and Reverse it?
public class TakeaStringasInputandReverseit {
	public static void main(String[] args) {
		String original,reverse="";
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a String to Reverse");
	original= input.nextLine();
	
	int length=original.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+original.charAt(i);
	}
	System.out.println("Reverse of entered string is :"+reverse);
  }
}