package com.qspiders.pack1;
//jagged Array:it is an 2D Array  where each array has different no.of values
public class jaggedArray {
	public static void main(String[] args) {
		
		int[][] arr={{10,20,30},{40,50},{60,70,80,90},{100}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("********");
		// enhanced for loop.
		for(int a[]:arr)
		{
			for(int b:a)
			{
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println("&&&&&&&&&&&&&&&&&&");
		
		int arr2[][]=new int[4][];
		// 1st way to intialise
		arr2[0]=new int[3]; // or arr2[]=new int[]{10,20,30};
		arr2[1]=new int[2];
		arr2[2]=new int[4];
		arr2[3]=new int[1];
	// 2md way to intialise
		arr2[1][0]=40;
		arr2[1][1]=50;
		
		arr2[2][0]=60;
		arr2[2][1]=70;
		arr2[2][2]=80;
		arr2[2][3]=90;
		
		arr2[3][0]=100;
		
				
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
