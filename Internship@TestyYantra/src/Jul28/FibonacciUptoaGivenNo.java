package Jul28;

//7.Write a program in Java to print Fibonacci series up to given number?

import java.util.Scanner;

public class FibonacciUptoaGivenNo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to produce fibonacci Numbers...");
		int maxval=sc.nextInt();
		
		int first =0;
		int second=1;
		int next=1;
		
		System.out.print(first+","+ second);
		
		while(first+second<=maxval)
		{
			next=first+second;
			System.out.print(","+next);
			first=second;
			second=next;
		}
	}
}

