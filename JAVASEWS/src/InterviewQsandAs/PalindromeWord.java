package InterviewQsandAs;

import java.util.Scanner;

// WAP to verify  If the given word is a Palindrome or not(Palindrome: characters appears same in both sides eg:MADAM)
public class PalindromeWord {
	public static void main(String[] args) {
		String original;
		String reverse="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String to check if it is a Palindrome");
		original=input.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Entered String is a Palindrome");
		}
		else
		{
			System.out.println("Entered String is not a Palindrome");
		}
		input.close();
	}
}
