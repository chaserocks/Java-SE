package Jul28;

//3) How to find if a number is power of 2 in Java? (1,2, 4 power of 2, 3 is not)

import java.util.Scanner;

public class powerof2 
{	
	static boolean isPowerOfTwo()
	{
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter any number...? ");
		int number = in.nextInt();
	 	 
		boolean isPowerOfTwo = true;
		int reminder = 0;
		
		while(number > 1)
		{
			reminder = number % 2;
			if(reminder != 0)
			{
				isPowerOfTwo = false;
				break;
		     }
			else
			{
				number = number / 2;
			}
		}
		   	return isPowerOfTwo;
	}	

	public static void main(String[] args)
	{
		System.out.println(isPowerOfTwo());	
	}
}	

