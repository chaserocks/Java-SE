package Aug02;

import java.util.Scanner;

// WAP to Swap Numbers

public class SwapNos {

	public static void main(String[] args) {
		
		int temp;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first value..?");
		int in1=input.nextInt();
		

		System.out.println("Enter second value..?");
		int in2=input.nextInt();

		temp=in1;
		in1=in2;
		in2=temp;
		
		System.out.println("first number of in1 is: "+in1);
		System.out.println("second number of in2 is: "+in2);
	}

}
