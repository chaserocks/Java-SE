package com.qspiders.pack1;
					
class C
{

}
public class Demo91 {


	public static void main(String[] args) {
		C c1=new C();
		C c2=new C();
		C c3=new C();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		 System.out.println(c1==c2);
		 System.out.println(c1.equals(c3));
		 //equals method not overriddien, hence will compae address.
		 c1=c3;
		 System.out.println(c1==c3);
		 System.out.println(c1.equals(c3));
		 // equals method not overriden hence willc compare address
		 
		 System.out.println("-------------");
		 
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
		 
		 // for understanding
		 String s1=new String("JAVA");
		 String s2=new String("JAVA");
		 System.out.println(s1==s2); // here checks and compare for the address.
		 System.out.println(s1.equals(s2)); // checks and compares for the value
		 
	}

}
