package com.qspiders.pack1;

import java.util.ArrayList; 
import java.util.Collections;

public class ArrayListSortDemo {
	 //Sorting ArrayList with same type
	//Sorting can be done only if Collection is of same type
	public static void main(String[] args)
	{
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add(25); 
		lst.add(15); 
		lst.add((int)12.56);
		System.out.println("Before Sorting");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("After Sorting");
		System.out.println(lst);
		lst.clear();
		lst.add("Bharath");
		lst.add("Suresh");
		lst.add("Neeraj");
		lst.add("Vishnu");
		lst.add("Aakash");
		System.out.println("Before Sorting");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("After Sorting");
		System.out.println(lst);
		Collections.shuffle(lst); 
		System.out.println("After shuffling");
     	System.out.println(lst);     

 }
}