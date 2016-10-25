package Aug01;


//5. Calculate Circle Area using Java Example

import java.util.Scanner;

public class AreaOfAcirCle {
	
	public static void main(String[] args) {
		
		int radius;
		float area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of the Circle");
		
		radius=sc.nextInt();
		area=(float)(3.14*radius*radius); // Area of a Circle is pii (r2)
		System.out.println("Area of a Circle: " + area);
	}
}
