package com.qspiders.pack1;

import java.util.ArrayList;
import java.util.Collections;


class Students implements Comparable {
String name;
Integer id;
Double cgpa; 

public String toString()  
{
	return"\nName="+ name+ "\nId="+ id+ "\nCgpa="+ cgpa;   
}

 Students(Integer id,String name,Double cgpa) 
{ 
	this.id=id; 
	this.name=name;
	this.cgpa=cgpa; 	
} 
public int compareTo(Object o) 
{ 
	//return this.id.compareTo(((Students)o).id);
	 return this.name.compareTo(((Students)o).name);
	//return this.cgpa.compareTo(((Students)o).cgpa);  
}
}

public class ComparableDemo 
{
	public static void main(String[] args) 
	{
		
        Students s2=new Students(112,"Girish",10.0); 
        Students s1=new Students(103, "Harsha", 9.9);    
        Students s3=new Students(98, "Bhanuprakash", 9.8); 
        
        ArrayList lst=new ArrayList<>();        
        lst.add(s1);       
        lst.add(s2);    
        lst.add(s3);     
        System.out.println(lst);
        System.out.println("**************");
        
        Collections.sort(lst);     
        System.out.println(lst);   
        }
}


