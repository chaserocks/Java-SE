package Aug01;

//3. Write a java code to take input some integer say 100 from keyboard. Then sum the odd numbers and even numbers ?

import java.util.Scanner;
public class SumofOddandEvenNos {
	public static void main(String[] args) {
		
		int j=0,k=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any Number..?");
		
		int num=input.nextInt();
		
		System.out.println("List of Even Numbers in the Given Range");
		for(int i=0;i<=num;i++)
		{
			if(i % 2==0)
			{
				System.out.print(i+" ");
				j=j+i;
			}
		
		}
		System.out.println(" ");
		System.out.println("sum of the Even Numberes "+ j);
		System.out.println(" ");
		System.out.println("List of Odd Numbers in the Given Range");
		
		for(int i=0;i<=num;i++)
		{
			
			if(i%2==1)
			{	
				System.out.print(i+" ");
				k=k+i;
			}		
		}
		
		System.out.println(" ");
		System.out.println("sum of the Odd Numberes "+ k);
	}
 }
