package PCLJava;

public class ArrayAverage {
	public static void main(String[] args) {
		int[] numbers=new int[]{10,20,30,50,40,3,60,80,7,100,5};
		// to print the average of array elements
		int sum=0;
		for(int i=0;i<numbers.length;i++)
			sum=sum+numbers[i];
		double average=sum/numbers.length;
		System.out.println("Average value of array elements is :" + average);
		//to give you the mean based on add or even no's(elements)
		if(numbers.length % 2==0)
		{
			int num1pos=numbers.length/2;
			int num2pos=num1pos+1;
			double mean=(numbers[num1pos-1]+numbers[num2pos-1])/2;
			System.out.println(mean);
		}
		else
		{
			int num1pos=numbers.length/2;
			System.out.println(numbers[num1pos]);
		}
	}
}
