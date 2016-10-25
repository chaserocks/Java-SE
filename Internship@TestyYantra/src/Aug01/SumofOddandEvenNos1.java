package Aug01;

import java.util.Scanner;

public class SumofOddandEvenNos1 {
public static void main(String[] args) {
	
	int j=0,k=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter any Number..?");
	
	int numb=input.nextInt();
System.out.println("**********");
System.out.println("List of Even and Odd Number: ");
	for(i=0;i<=numb;i++)
	{
		if(i % 2==0) 
		{
			evenMethod();
			
			j=j+i;
		}
		else
		{ 
			oddMethod();
		
			k=k+i;
		}			
	}	
    System.out.println(" ");
	System.out.println("sum of even number "+j);
	System.out.println(" ");
	System.out.println("sum of even number "+k);

}	

 static int i;

 public static void evenMethod()
  { 
	 System.out.print(i+"  ");
  }
  public static void oddMethod()
  {
	  System.out.println(i+" ");
  }
}
