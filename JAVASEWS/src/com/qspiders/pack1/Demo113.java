package com.qspiders.pack1;

public class Demo113 {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int val=10;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=val;
				val+=10;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
				
	}
}
