package com.qspiders.pack1;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*How to convert a Vector to List. The steps are as follows:
1) Create a Vector and populate it
2) Convert it to a List by calling Collections.list(vector.elements()) which returns a List object.
Example: To explain the logic we are assuming that Vector is having elements of String type(). However if you want to have a different type 
then just change the generics in the below code.*/

public class VectorToList {
		 
		  public static void main(String[] args) {
		 
		     // Step1: Creating a Vector of String elements
		     Vector<String> vector = new Vector<String>();
		 
		     // Step2: Populating Vector
		     vector.add("Tim");
		     vector.add("Rock");
		     vector.add("Hulk");
		     vector.add("Rick");
		     vector.add("James");
		 
		    // Step3: Displaying Vector elements
		    System.out.println("Vector Elements :");
		    for (String str : vector){
		       System.out.println(str);
		    }
		 
		    // Step4: Converting Vector to List
		    List<String> list = Collections.list(vector.elements());
		 
		    // Step 5: Displaying List Elements
		    System.out.println("\nList Elements :");
		    for (String str2 : list){
		       System.out.println(str2);
		    }
		 }
		}

