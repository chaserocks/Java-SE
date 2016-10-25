package Aug02;

import java.util.Scanner;

// WAP Prime Numbers Java Example (By Factor)

public class PrimeNoByFactor {
	public static void main(String[] args) {
		for(;true;)  // It will ask to input repeatedly after the execution of the previous
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number..? ");
			int num=s.nextInt();
			
			int count=0;
			for(int i=1;i<num;i++)
				
			if(num % i==0)
			{
				count ++;
			}
			
			if(count<=2)
			{
				System.out.println(num +" is a prime number");
			}
			else
			{
				System.out.println(num +" is not a prime number");
			}
	     }
 }
}





