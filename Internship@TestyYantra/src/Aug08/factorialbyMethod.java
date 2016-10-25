package Aug08;



//
import java.util.Scanner;
public class factorialbyMethod{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to find the factorial");
		int factnum=input.nextInt();
		
		printFact(factnum);
	}
	
	static void printFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		}
		
	}