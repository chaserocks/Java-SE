package Aug01;

// 10.Read Number from Console and Check if it is a Palindrome Number?

import java.util.Scanner;
public class PalindromeNo {

	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number..?");
		 int num=sc.nextInt();
		 
		 int rev=0,r;
		 int temp=num;
		 while(num>0)
		 {
			 r=num%10;
			 rev=(rev*10)+r;
			 num=num/10;
		 }
		 
		 if(rev==temp)
			 System.out.println("num is pallindrum");
		 else
			 System.out.println("num is not pallindrum");
	}
}
