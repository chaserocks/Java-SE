
package InterviewQsandAs;

import java.util.Arrays;

public class ArraySplit {
	public static void main(String[] args) {
		int[] numbers=new int[] {4,5,1,8,7,3};
		// Array.CopyRange(array,from to )
		//from: the initial index of  the range to be copied inclusive.
		//to: the final index of the range to be copied,exclusive.
		int[] arr1=Arrays.copyOfRange(numbers, 0, 2);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		
		int[] arr2=Arrays.copyOfRange(numbers, 2, 4);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		int[] arr3=Arrays.copyOfRange(numbers, 4,6);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
				
	}

}
