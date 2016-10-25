package com.qspiders.pack1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hm=new HashMap();  
		hm.put("ind", "India");     
		hm.put("nz","NewZealand");     
		hm.put("uk", "UnitedKingdom");    
		System.out.println(hm.size()); //print the size      
		System.out.println(hm);//print all key - value pair 
		System.out.println("**********");
		if (hm.containsKey("ind"))      
		{
			System.out.println(hm.get("ind")); 
		} 
		System.out.println(hm.containsValue("Japan"));
		
		//print all the keys
	    System.out.println(hm.keySet());
    //print all the values
    System.out.println(hm.values()); 
    System.out.println("&&&&&&&&&&&&&&");
    //1st way
    
    Set keys=hm.keySet();    
    
    Iterator itrkeys=keys.iterator();      
    String s;
    while(itrkeys.hasNext())      
    {              
    	System.out.println(s=(String)itrkeys.next()); //prints key and next
    	System.out.println(hm.get(s)); // prints the value
    }       
    System.out.println("-----------");
    /*
    // alternate ways-2A      
      //   Set keys=hm.keySet(); 
         for(Object o:keys)       
            {
              System.out.println(o);
            } 
             System.out.println("----------");
             
             //-2B
             
             for(Object o:hm.keySet())
             {
             System.out.println(o);
             }
      */        
    System.out.println(hm.values());
    
    System.out.println("**********************");
    
    for(Object obj:hm.values())
    {   
    	System.out.println(obj);
    }
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
  Collection<String>  values=hm.values(); 
  Iterator itr2=  values.iterator(); 
  while(itr2.hasNext())
  { 
	  System.out.println(itr2.next());
  } 
  
  } 
}


