package PCLJava;

import java.util.Scanner;

public class Primeno {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to check");
	int num=sc.nextInt();
	
	boolean flag=true;
	
	for(int i=2;i<=num/2;i++)
	{
		if(num % i ==0) // % is mode operator.
		{
			flag=false;
			break;
		}
	}
	if(flag)
		System.out.println(num +" "+ "is prime");
	else
		System.out.println(num +" "+ "is not a prime");
	
}
}
