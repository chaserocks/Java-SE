package com.qspiders.pack1;


public class Demo112 {
	public static void main(String[] args) {
		

		String arr[]={"AB","ABC","CF"};
		System.out.println(arr.length);
		System.out.println(arr[0].length());
		System.out.println(arr[1].length());
		System.out.println(arr[2].length());
		System.out.println("****************");
		
		String arr1[][]={{"AB","BC"},{"GHT","TR"}};
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println("*********************");
		System.out.println(arr1[1][0].length());
		System.out.println(arr1[1][1].length());
		System.out.println(arr1[0][0].length());
		System.out.println(arr1[0][1].length());
	}
}
