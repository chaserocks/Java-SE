package com.qspiders.pack1;

import java.util.Arrays;

//fight or fly away.
// Read and analysis and practice (till u fix that in ur mind)

public class Demo108 {
			
	public static void main(String[] args) {
			int arr[]=new int[3];
			arr[0]=10;
			for(int i:arr)
				System.out.println(i);
			
			String arr1[]=new String[3];
			arr1[0]="nice";
			arr1[1]="hey";
			
			for(String s:arr1)
				System.out.println(s);
			
		Mango arr2[]=new Mango[5];
			
			Mango a1=new Mango();
			
			arr2[0]=new Mango();
			arr2[1]=new Mango();
			arr2[2]=a1;
			
			for(Mango m:arr2)
				System.out.println(m);
			System.out.println("........................");
			
			int arr3[]={10,'a','v',4,5,6,7,'B',6,'Z'};
			
			for(int i: arr3)
				System.out.println(i);
			
			for(int i: arr3)
			{
				if((i>=65 && i<99 || (i>=97 && i<=122)))
				System.out.println((char)i);
				
			}
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");
			
			int a[]={10,20,60,40,50};
			Arrays.sort(a);
			System.out.println("Array element after sort");
			
			for(int x : a)
			{
				System.out.println(x);
			}
			
			System.out.println("Using toString method of Arrays class");
			System.out.println(Arrays.toString(a));
	
		System.out.println("**************");
			
			int b[]={10,3,47,04,8};
			System.out.println("Array element before sort");
			for (int x:b)
			{
				System.out.println(x);
			} 
			
			//2nd way   
			
			System.out.println(Arrays.toString(b));
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
			
			System.out.println("Array element after sort"); 
			Arrays.sort(b);
			for (int x:b)
			{
				System.out.println(x);
			}      
			   
         	//2nd way   
			System.out.println(Arrays.toString(b));
	}
			
}
