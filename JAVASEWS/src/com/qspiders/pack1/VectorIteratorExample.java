package com.qspiders.pack1;

import java.util.Iterator;
import java.util.Vector;
/* How to traverse a Vector using Iterator. The steps are as follows:
1) Create a Vector
2) Add elements to it using add(Element E) method of Vector class
3) Obtain an iterator by invoking iterator() method of Vector.
4) Traverse the Vector using hasNext() and next() method of Iterator.*/

public class VectorIteratorExample {

		  public static void main(String[] args) {

		     // Creating a Vector of Strings
		     Vector<String> vector = new Vector<String>();
		 
		     //Adding elements to the Vector
		     vector.add("Mango");
		     vector.add("Orange");
		     vector.add("Apple");
		     vector.add("Grapes");
		     vector.add("Kiwi");
		 
		     //Obtaining an iterator
		     Iterator it = vector.iterator();

		     System.out.println("Vector elements are:");
		     while(it.hasNext()){
		       System.out.println(it.next());
		     }
		  }
		}
