package com.qspiders.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



interface Fruit{
	
}
class Grape implements Fruit{
	
/*	if(g instanceof Grape)
	{
		return true;
		else 
			return false;
	}*/
}

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList lst=new ArrayList();
	lst.add(10); // wrapped Object
	lst.add(true); // wrapped Object
	lst.add("Hello");
	lst.add(new String("Bangalore"));
	lst.add(new Grape());
	Grape g1=new Grape();
	lst.add(g1);
	// no.of elements(Objects)
	System.out.println(lst.size());
	System.out.println(lst.contains(true));
	System.out.println(lst.contains("Hello"));
	System.out.println(lst.contains("Bangalore"));
	System.out.println(lst.contains(new Grape()));
	System.out.println(lst.contains(g1));
	
	System.out.println("-------get specific object------");;
	System.out.println(lst.get(3));
	System.out.println(lst.get(4));
	
	String s1=null; // finding the length of the String of a specifi Array value(2) i.e Hello.
	if(lst.get(2) instanceof String)
	{
		s1=(String)lst.get(2);
		System.out.println(s1.length());
	}
	System.out.println("-------get all objects & print --------");
	
	for(int i=0;i<lst.size();i++)
	{
		System.out.println(lst.get(i));
	}
	System.out.println("------------ using the enhanced for loop.get all the Objects and Print------");
	
	for(Object obj: lst)
	{
		System.out.println(obj);
	}
	
	// to add Objects of the same type
	// ArrayList<Integer>lst2=new ArrayList<>(); // works in JDK 1.7
	//  ArrayList<Integer>lst2=new ArrayList<Integer>();
	//  ArrayList<Grape>lst3=new ArrayList<Grape>();
	 
	ArrayList<String>lst1=new ArrayList<String>();
	lst1.add("Nice");
	lst1.add("Bharath");
	lst1.add("Chandra");
	
	 /*ArrayList<Fruit>lst=new ArrayList<Fruit>();
	 lst.add(new Grape()); // Objects of Fruit interface
	 // Objects of class implementing fruit interface */
	
	// Generics concept: Objects of the same type.
	
	System.out.println("---get all the String Objects and print using enhanced for loop--------");
	
	for(String str: lst1)
	{
		System.out.println(str);
	}
	
	System.out.println("converting to object array and printing Objects");
	Object[] objs=lst1.toArray();
	for (Object o: objs)
	{
		System.out.println(o);
	}
		
	System.out.println("*************************");
	
	 System.out.println("Using iterator");
	    Iterator itr=lst.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    

	    System.out.println("Using ListIterator");
	    
	    ListIterator  litr=lst.listIterator();
	    
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());
	    }
	    
	    
	    System.out.println("Going reverse");
	    
	    while(litr.hasPrevious())
	    {
	    	System.out.println(litr.previous());
	    }
	    List lst4=new ArrayList();
	    lst4.add("Java");
	    lst4.add(100);
	    lst4.add(1, true);
	    System.out.println(lst4);
	    System.out.println("+++++++++++++++++++++++++");
	    
	    lst1.addAll(lst4);
	    System.out.println(lst1);
	    System.out.println(lst);
	    lst.remove(1); //remove at index 
	    System.out.println(lst);
	    
	    lst.remove(Integer.valueOf(10)); // Wrap it to remove a primitive value
	    // lst.remove(new Integer(10));
	    System.out.println(lst);
	    lst.remove(g1); // removes an object ref. vlaue
	    System.out.println(lst);
	   System.out.println("&&&&&&&&&&&&&&&&&&&&&&"); 
	    System.out.println(lst1);
	    lst1.removeAll(lst4); // removes all items in the given list.
	    System.out.println(lst1);
	    System.out.println("@@@@@@@@@@@@");
	    lst1.addAll(lst4);
	    System.out.println(lst1);
	    lst1.retainAll(lst4); // retainAll(): retains items in the list and removes the rest.
	    System.out.println(lst1);
	    lst1.clear();
	    System.out.println(lst1);    
}
}
