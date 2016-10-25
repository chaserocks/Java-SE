package com.qspiders.pack1;



public class Demo110 {
	public static void main(String[] args) {
		int arr[]=new int[3];
		arr[0]=10;
		for(int i : arr)
		{
			System.out.println(i);
		}
			String arr1[]=new String[3];
			arr1[0]="Hello";
			for(String s: arr1)
			{
				System.out.println(s);
			}
			
			//Gouva array
			Gouva arr2[]=new Gouva[3];
//			Gouva object referred to g2 ref var.
			Gouva g2=new Gouva();
			arr2[0]=new Gouva();
			arr2[1]= g2;
			arr2[2]=new Gouva();
			for(Gouva g:arr2)
			{
				System.out.println(g);
			}
			
			
	}

}
