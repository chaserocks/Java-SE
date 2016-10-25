package Aug02;

// Write a program using if, if – else, while, do while, for loop, nested for loop, swtich statement, also use continue, break statement.

import java.util.Scanner;

public class ConditionLoopsandStatements {
public static void main(String[] args) {
	
	// Use of "if" :
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Age..?");
			int age=s.nextInt();
			if(age>=18)
				System.out.println("Eligible to vote");
			else
				System.out.println("Not eligible to vote");

//  Use if "if – else" : 
			
	int x,y,z;
	System.out.println("Enter three numbers");
	Scanner in=new Scanner(System.in);
	x=in.nextInt();
	y=in.nextInt();
	z=in.nextInt();
	
	if(x>y&&x>z)
		System.out.println("First number is largest");
	else if(y>x&&y>z)
		System.out.println("Second number is largest");
	else if(z>x&&z>y)
		System.out.println("Third number is largest");
	

// Use of "while" : 

	System.out.println("Example for While");
	
	int i=1;
	
	while(i<=10)
	{
		System.out.println(i); //o/p: 1 to 10.
		i=i+1;
	}


// Use of "do while" :

	System.out.println("Example for do While");
	
	int p=1;
	
	do
	{
		System.out.println(p); //o/p: 1 to 10.
		p=p++;
	}	
	while(p<=10);

// Use of "for loop" :
	
		for(int j=1;j<=10;j++)
		{
			System.out.println("I Love Java");
		}
		

// Use of "nested for loop" :

		System.out.println("Example for nested forloop");
		for(int m=1;m<=5;m++)
		{
			for(int j=1;j<=5;j++)
			  System.out.print(m); 
		      System.out.println();
		} 
			System.out.println();
		
		for(int k=1;k<=5;k++)
            {
                for(int l=1;l<=5;l++)
                System.out.print(l); 
      			System.out.println();
			}

// Use of "Continue" Statement:
		
				System.out.println("Continue Demo");
				for(int j=0;j<10;j+=2)
				{
					if(j==6)
					{
						continue;
					}
					System.out.println(j);
				}
				
				//using labelled continue:
				
				int a,b;
				demo:
				
					for(a=0;a<5;a++)
					{
					  for(b=2;b<5;b++)
					  {
						  if(a==b)
						  {
							  continue demo;  
						  }  
						  System.out.println("a= " +a +" " +"b= " +b);
					  }
						
					}

// Use of "swtich" statement along with break statements :

		 System.out.println("Enter First Letter of any Fruit..?");
		 Scanner inp=new Scanner(System.in);
		   String items=inp.nextLine();
		   items=items.toLowerCase();
		
		   switch(items)
		    {
		   case "A":
			   System.out.println("Apple");
			   break;
		   case "B":
			   System.out.println("Banana");
			    ;
		   case "C":
			   System.out.println("Cherry");
			   break;
		   case "D":
			   System.out.println("Dates");
			   break;
		   case "E":
			   System.out.println("ElderBerry");
			   break;
		   case "F":
			   System.out.println("Fig");
			   break;
		    }	
    }
}