package com.qspiders.pack1;

public class Arraycomponents {

	
	public static void main(String[] args) {
		
		//int[] marks={30,60,80,90};
	
		
		int arr[]=new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		for(int i=0;i<=arr.length-1;i++)
		
		System.out.println(arr[i]);
		
		
		
		String arr1[]=new String[3];
		arr1[0]="I";
		arr1[1]="Love";
		arr1[2]="Java";
		
		for(String  a: arr1)
		{
			System.out.println(a);
		}
		
		
		
			String s1="bharath";
			
			
			StringBuffer s2=new StringBuffer(s1).replace(1, 2, "a");
			System.out.println(s2);
			
			 String s3="Bharath";
			    StringBuffer sb7=new StringBuffer(s3);
			    sb7.reverse();
			    String s5=sb7.toString();
			    System.out.println(s5);
			    
			    String s4=new StringBuffer(s3).reverse().toString();
			    System.out.println(s4);
			    
			    String s6=new StringBuffer(s3).replace(1, 3, "x").toString();
			    System.out.println(s6);
			    
			
	}

}
