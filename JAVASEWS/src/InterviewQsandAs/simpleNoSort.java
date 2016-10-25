package InterviewQsandAs;

import java.util.Arrays;

// WAP for a simple number sort?

// Sorting in the descending order, however, is only possible either by writing your own sorting code, or converting your array to integer
// Objects then importing it from the Collections library.
public class simpleNoSort {
	public static void main(String[] args) {
	
	int[] arr=new int[6];
	arr[0]=20;
	arr[1]=30;
	arr[2]=10;
	arr[3]=40;
	arr[4]=60;
	arr[5]=50;
	
	Arrays.sort(arr);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}