package Jul28;

//2) Write a program in Java to find out if a number is prime or not?

import java.util.Scanner;

public class Primeno {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number..?");
	int num=sc.nextInt(); //capture the input in an integer
	
	boolean flag=true;
	
		int i=2;

		if(num % i ==0) // % is a mode operator.
		{
			flag=false;
		}
	if(flag)
		System.out.println(num +" "+ "is prime");
	else
		System.out.println(num +" "+ "is not a prime");
	
  }
}
