package com.qspiders.pack1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args)
	{
		LinkedList lst=new LinkedList();
		lst.add(100);  
		lst.add("Java"); 
		lst.add(12.45);
		lst.add(true);
		System.out.println(lst);
		System.out.println("--print first item--");
		System.out.println(lst.getFirst());
		System.out.println(lst.get(0));         
		System.out.println("--print last item--");    
		System.out.println(lst.getLast());     
		System.out.println(lst.get(lst.size()-1));       
		System.out.println("--print all items one by one--");
		lst.addFirst("Hello");           
		System.out.println(lst);         
		lst.addLast("Bangalore");    
		
		ListIterator litr=lst.listIterator();       
		System.out.println("Using ListIterator"); 
		System.out.println("Using hasNext()");
		while(litr.hasNext())      
		{                
			System.out.println(litr.next());
			}       
		System.out.println("Using hasPrevious()");
		while(litr.hasPrevious())      
		{              
			System.out.println(litr.previous()); 
			}
		//You can also use simple for,enhanced for,//toArray(),iterator() to traverse through items/objects, descendingIterator peek,poll    
		}
	}
	

