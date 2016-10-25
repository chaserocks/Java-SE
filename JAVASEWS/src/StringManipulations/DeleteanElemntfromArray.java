package StringManipulations;

import java.util.Scanner;

// How to Delete an Element from an Array?

public class DeleteanElemntfromArray {
public static void main(String[] args) {
	int[] arr={10,2,14,78,3};
	System.out.println("Enter the Position that you want to delete:");
	Scanner sc=new Scanner(System.in);
	int position=sc.nextInt();
	arr[position-1]=0; // since array starts from 0 then. 
	for(int value:arr)
	{
		System.out.println(value+" ");
	}
}
}
