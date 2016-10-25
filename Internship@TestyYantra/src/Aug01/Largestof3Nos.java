package Aug01;

//4.WAP to print the Higehest of three numbers?
import java.util.Scanner;

public class Largestof3Nos {
		
	public static void main(String[] args) {
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
	 }
	}


