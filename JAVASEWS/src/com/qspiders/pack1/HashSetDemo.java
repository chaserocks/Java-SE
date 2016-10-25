package com.qspiders.pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {     
		HashSet hs=new HashSet();          
		hs.add(10);        
		hs.add(12.45);      
		hs.add("Hello");      
		hs.add(10);         
		hs.add(true);        
		System.out.println(hs); 
		System.out.println("-- iterator--");
		Iterator itr=hs.iterator();    
		System.out.println("first time");
		while(itr.hasNext())        
		{               
			System.out.println(itr.next());    
		}
		//alternate way 
		System.out.println("--enhanced forloop--");
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
		Set<Integer> hs1=new HashSet<>(); 
		hs1.add(10);          
		hs1.add(20);    
		hs1.add(30);     
		hs1.add(40);         
		hs1.add(50); 
	System.out.println(hs1);
	System.out.println("****************");
   HashSet<Integer> hs2=new HashSet<Integer>();
    hs2.add(20);
    hs2.add(40);
    hs2.add(90);
    hs1.addAll(hs2); //add non duplicate objects, what ever the elements present in the hs2 adding those elements in the hs1. 
    System.out.println(hs1);
    hs1.retainAll(hs2);//retains in hs1 what is present in hs2 and also hs1 & removes all others. (what ever there in the hs2 must&should be there in the list).   
    System.out.println(hs1);
  }
}
