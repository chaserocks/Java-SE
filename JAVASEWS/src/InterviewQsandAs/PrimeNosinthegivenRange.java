package InterviewQsandAs;

import java.util.Scanner;



public class PrimeNosinthegivenRange {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=Integer.parseInt(input.nextLine());
		System.out.println("Prime Number");
		
	for(int i=1;i<=num;i++)
	{
		int j;
		for(j=2;j<i;j++)
		{
			int n=i%j;
			if(n==0)
			break;
		}
		if(i==j)
		{
			System.out.println(" "+i);
		}
	}
  }
}
