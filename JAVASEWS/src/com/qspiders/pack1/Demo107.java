package com.qspiders.pack1;

public class Demo107 {
	
	public static void main(String[] args) {
		
	
	int[] arr=new int[5];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	
	System.out.println("------------");
	
//	int arr1[]; //decalartion
//	arr1[]=new val=10;      // or
	
	int arr1[]=new int[10]; 
			int val=10;
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=val;
			val+=10;
		}
		
		for(int i=0;i<arr1.length;i++)
			
		System.out.println(arr1[i]);
	
		System.out.println("-------------------");
	//int arr2[]={10,20,30,40,50,60}; //or
	int arr2[]=new int[] {10,20,30,40};
	
//	for(int i=0;i<arr2.length;i++)
//	System.out.println(arr2[i]); or
	
	for(int a:arr2)
		System.out.println(a);
	
	System.out.println(",,,,,,,,,,,,,,,,,,");
	
	
	//arr2.toString()
	
	

	
	
	
	
	}
}
