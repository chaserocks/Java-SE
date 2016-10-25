package StringManipulations;

import java.util.Scanner;

//WAP tp print the sum of the series 1+x+x*2+x*3+......+x*n ?
public class SumoftheSeries {
public static void main(String[] args) {
	int result=0;
	int sum=0;
	System.out.println("Enter a value:");
	System.out.println();
	Scanner sc=new Scanner(System.in);
	int value=sc.nextInt();
	System.out.println("Enter the power");
	System.out.println();
	int power=sc.nextInt();
	
	for(int i=1;i<=power;i++)
	{
		for(int j=1;j<=i;j++)
		{
			sum=sum+value;
		}
	}
	result=1+sum;
	System.out.println("Sum of the series is :"+result);
	System.out.println();
  }
}
