package Aug02;

import java.util.Scanner;

public class SwapWOUsing3rdVariable {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter first value..?");
	int in1=input.nextInt();
	
	System.out.println("Enter second value..?");
	int in2=input.nextInt();
	
	in1=in1+in2; // eg: in1= 40+20 = 60
	in2=in1-in2; //     in2= 60-20 = 40
	in1=in1-in2; //     in1= 60-40 = 20
	
	System.out.println("Swapping without third Variable");
	
	System.out.println(in1);
	System.out.println(in2);

 }
}
