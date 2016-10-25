package Aug01;

import java.util.Scanner;

//6. Reverse Number using Java?

public class ReverseANo {
	
	public static void main(String[] args) {

	  	int num, remainder,reverse=0;

	  	// this is by giving input any value 
		System.out.println("Enter an Integer Value..?"); // 0(zero)  will nt be printed in o/p.
		Scanner input=new Scanner(System.in);
		num = input.nextInt();
		
    while(num>0)
		{
		    remainder=num%10;
			reverse=remainder+reverse*10;
			num=num/10;
    	}
		System.out.println(reverse);
		
//		Another Ways: 1
		
			int original=1234;
			StringBuffer rev=new StringBuffer();
			String str=Integer.toString(original);
			int length=str.length();
			
			for(int i=length-1;i>=0;i--)
			{
				rev=rev.append(str.charAt(i));
			}
			System.out.println("Reverse of the No."+ rev.toString());
			System.out.println();
			
//		Another Ways: 2  (This is for a given Value)
			
			int x=1234;
			int y=0;
			int temp=0;
			
			while(x>0)
			{
				temp=x%10;
				y=y*10+temp;
				x=x/10;
			}
			System.out.println(y);
			
//			Another Ways: 3 (This is for easy way by the use of String Buffer)
			
			int x1=7890; // 0(zero)  will nt be printed in o/p.
			int x2=2314;
			
	      System.out.println(Integer.parseInt(new StringBuffer(Integer.toString(x1)).reverse().toString()));
	      System.out.println(Integer.parseInt(new StringBuffer(Integer.toString(x2)).reverse().toString()));	
		
	}

}
