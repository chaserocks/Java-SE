package com.qspiders.pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class Student1
{
	String name;
	int id; 
	double cgpa; 
	
	public String toString() 
	{
		return"\nName="+ name+ "\nId="+ id+ "\nCgpa="+ cgpa; 
	}
	Student1(Integer id,String name,Double cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;	
     }
}

class SortByName implements Comparator<Student1> 
{
	public int compare(Student1 o1, Student1 o2)
	{
		return o1.name.compareTo(o2.name); 
	}
}

class SortById implements Comparator<Student1> 
{ 
	public int compare(Student1 o1, Student1 o2)
	{
		if(o1.id>o2.id) 
			return 1;
		else
			return -1;
	}
} 

class SortByCgpa implements Comparator<Student1>
{
	public int compare(Student1 o1, Student1 o2)
	{ 
		if(o1.cgpa>o2.cgpa) 
			return 1;
		else 
			return -1;
	}
}

public class ComparatorDemo 
{
	public static void main(String[] args)
	{
		Student1 s2=new Student1(112,"Girish",10.0);  
		Student1 s1=new Student1(103, "Harsha", 9.9);
		Student1 s3=new Student1(98, "Bhanuprakash", 9.8);
		
    ArrayList lst=new ArrayList<>(); 
    lst.add(s1); 
    lst.add(s2); 
    lst.add(s3);
    System.out.println(lst);
    System.out.println("*************");
    
    Collections.sort(lst, new SortByName());  
    System.out.println(lst);
    System.out.println("-----------");
    
    Student1[] students={s1,s2,s3}; 
    Arrays.sort(students,new SortById());    
    System.out.println(Arrays.toString(students));
    
    System.out.println("-----------");
    
    Arrays.sort(students,new SortByCgpa()); 
    System.out.println(Arrays.toString(students));   
    }
}


