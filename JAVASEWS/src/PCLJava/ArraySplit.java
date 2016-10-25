
package PCLJava;

import java.util.Arrays;

public class ArraySplit {
	public static void main(String[] args) {
		int[] numbers=new int[] {4,5,1,8,7,3};
		// Array.CopyRange(array,from to )
		//from: the initial index of  the range to be copied inclusive.
		//to: the final index of the range to be copied,exclusive.
		int[] arr1=Arrays.copyOfRange(numbers, 0, 3);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		int[] arr2=Arrays.copyOfRange(numbers, 3, 6);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
				
	}

}
