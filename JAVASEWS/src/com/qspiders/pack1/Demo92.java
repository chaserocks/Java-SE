package com.qspiders.pack1;

class Apple{
	
	int wt;
	Apple(int wt)
	{
	this.wt=wt;
	}

	public String toString()
	{
		return "wt=" + wt;
		
	}
	
	//syntax of the object.
	public boolean equals(Object o)
	{
		if(o==null)
		return false;
		
		if(this==o)
			return true;
		
		
		if(o instanceof Apple)
		return this.wt==((Apple)o).wt; // down casting here
		return false;
	}
}
public class Demo92 {
	
	
	public static void main(String[] args) 
	{
		Apple a1=new Apple(100);
		Apple a2=new Apple(120);
		Apple a3=new Apple(100);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a2==a3);
		
		System.out.println("-------------------");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a2.equals(a3));
		System.out.println(a2.equals(null));
		System.out.println(a2.equals(a2));

	}
}

