package Aug02;

// 4.Calculate the Average value of Array elements using Java?

import java.util.Scanner;
public class AverageofanArray {

	public static void main(String[] args) {
		
		int num;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no.of elements in an Array..?");
		num=input.nextInt();
	
	int [] nos=new int[num]; // Input the array elements from the Keyboard
	for(int i=0;i<num;i++)
	{
		nos[i]=input.nextInt();
	}
	
	double sum=0;
	
	for(int i=0;i<nos.length;i++)
	
		sum = sum + nos[i];  // 
		double avg=sum/nos.length;
	
		System.out.println("Average value of an array Element is: "+ avg);
		
// Another Way:
		System.out.println("******************");
		
		int[] numb=new int [3];
		numb[0]=10;
		numb[1]=20;
		numb[2]=30;
		int average=(numb[0]+numb[1]+numb[2])/3;
		System.out.println(average);
	
  }
}
