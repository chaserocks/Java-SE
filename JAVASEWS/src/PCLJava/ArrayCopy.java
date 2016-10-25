package PCLJava;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		// copy range to new array
		//20 30 40
		int arr[]={10,20,30,40,50};
		int arr1[]=Arrays.copyOfRange(arr, 1, 4);
		System.out.println(Arrays.toString(arr1));
		//copy range to existing array
		int arr2[]=new int[3];
		System.arraycopy(arr, 3, arr2, 1, 2);
		System.out.println(Arrays.toString(arr2));
	}
}
