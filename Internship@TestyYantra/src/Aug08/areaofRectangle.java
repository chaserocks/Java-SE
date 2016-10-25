package Aug08;

import java.util.Scanner;

public class areaofRectangle {
	
	public static void areaRectangle(int l, int w)
	{
		int area;
		area=l*w;
		System.out.println("Area of the rectangle of given length and width are: "+area);
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of lenght and width of the Rectangle...?");
		
		int len=input.nextInt();
		int wid=input.nextInt();
		
		areaofRectangle.areaRectangle(len, wid);
		
		// or create an object and then use the code as below:
		
//		areaofRectangle areaRec=new areaofRectangle();
		// areaRec.areaRectangle(len, wid);
		
		
	}
}
