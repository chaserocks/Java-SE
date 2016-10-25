package InterviewQsandAs;

import java.util.Scanner;
/* ADAM NO: If the reverse square root of the reverse of square of a number is the number itself then it is Adam Number.
For ex., 12 and 21
Take 12
square of 12 = 144
reverse of square of 12 = 441
square root of the reverse of square of 12 = 21
The reverse square root of the reverse of square of 12 = 12, then number itself.
Such number is called Adam Number*/
public class Adamno {
		 
		 public static void main(String args[])
		 {
		  Ex e=new Ex(); 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter n value ");
		  int n=sc.nextInt();
		  
		  //int n=12;
		  
		  int sq=n*n;
		  int r;
		 
		//  int sqr;
		  
		  r=e.reverse(sq);
		 // System.out.println("reverse of a number "+r);
		  //sqr=(int)Math.sqrt(r);
		  
		r=(int)Math.sqrt(r);
		//  System.out.println("reverse of a number "+r);

		               int sqrr=e.reverse(r);
		  
		  if(n==sqrr)
		  {
		   System.out.println("it is adam number");
		  }
		  else
		  {
		   System.out.println("it is not adam number");
		  }
		  System.out.println("reverse of sqrr="+sqrr);
		 }
		 
		}
		class Ex
		{
		 public int reverse(int sq)
		 
		 {
		  
		  int r=0;
		  //double r=0;
		  while(sq>0)
		  {
		      
		   r=r*10+sq%10;
		   sq=sq/10;
		  }
		  return(r);
		 // System.out.println("reverse of n="+r);
		  
		 }
		}

