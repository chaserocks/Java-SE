package com.qspiders.pack1;
// Direct assignment of values in 2D Array.
public class Demo111 {
	public static void main(String[] args) {
	
		// print using simple for loop
	int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	System.out.println("************************");
	// print using the enhanced for loop
	for(int a[]:arr)
	{
		for(int b:a)
		{
			System.out.print(b);
		}
	
		System.out.println();
	}
	}
}
