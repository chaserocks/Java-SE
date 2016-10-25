package com.qspiders.pack1;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Collections;

//same program for primitive comparison
       
	class Student implements Comparable<Student> 
	{    
		String name; 
	    int id; 
	    double cgpa;
	public String toString() 
	{
		return"\nName="+ name+ "\nId="+ id+ "\nCgpa="+ cgpa;
	}
	Student(Integer id,String name,Double cgpa) 
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	} 
	
	public int compareTo(Student o) 
	{
		/*if(this.id<o.id)
		   return -1;
	       else
	      return 1;*/
	      
		if(this.cgpa>o.cgpa) 
			return 1;
		else
			return -1;
		}
	} 
	
	public class ComparableDemo1  
	{
		public static void main(String[] args)
		{
			Student s2=new Student(112,"Girish",10.0); 
			Student s1=new Student(103, "Harsha", 9.9);
			Student s3=new Student(98, "Bhanuprakash", 9.8);  
			
			ArrayList lst=new ArrayList<>();      
			
			lst.add(s1);
			lst.add(s2);      
			lst.add(s3);     
			System.out.println(lst);  
			System.out.println("*******************");
			
			Collections.sort(lst);  
			
			System.out.println(lst); 
			System.out.println("-----------");  
			
			Student[] students={s1,s2,s3};      
			Arrays.sort(students);    
			System.out.println(Arrays.toString(students));
		} 
	}





