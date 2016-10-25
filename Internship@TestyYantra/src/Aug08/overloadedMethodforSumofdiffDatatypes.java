package Aug08;

import java.util.Scanner;

public class overloadedMethodforSumofdiffDatatypes {
	
	public static void methodInt(int a, int b)
	{
		int sum=a+b;
		System.out.println("sum of two integers is:" +sum);
	}
	
	public static void methodDouble(double c, double d)
	{
		double dsum=c+d;
		System.out.println("sum of two double Datat Type integers is:" +dsum);
	}
	
	public static void main(String[] args) {
	
		int i,j;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter any two integers for Addition..?");
	int in1=input.nextInt();
	int in2=input.nextInt();
	overloadedMethodforSumofdiffDatatypes olsum=new overloadedMethodforSumofdiffDatatypes();
	
	olsum.methodInt(in1, in2);
	
	System.out.println("Enter any two Double datatype integers for Addition..?");
	double in3=input.nextDouble();
	double in4=input.nextDouble();
	
	olsum.methodDouble(in3,in4);
		
	}
	
}
