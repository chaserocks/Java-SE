package Aug08;

import java.util.Scanner;

public class overloadedMethodsumof2and3interges {

	public static void methodIntof2(int a, int b)
	{
		int twosum=a+b;
		System.out.println("sum of two integers is:" +twosum);
	}
	
	public static void methodIntof3(int c, int d, int e)
	{
		int threesum=c+d+e;
		System.out.println("sum of two double Datat Type integers is:" +threesum);
	}
	
	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter any two integers for Addition..?");
	int in1=input.nextInt();
	int in2=input.nextInt();
	 overloadedMethodsumof2and3interges olsum=new  overloadedMethodsumof2and3interges();
	
	olsum.methodIntof2(in1, in2);
	
	System.out.println();
	
	System.out.println("Enter any three integers for Addition..?");
	int in3=input.nextInt();
	int in4=input.nextInt();
	int in5=input.nextInt();

	olsum.methodIntof3(in3,in4,in5);
		
	}
	
}



