package com.qspiders.pack1;

class Halwa
{

	int wt;
	Halwa(int wt)
	{
		this.wt=wt;
	}
	public String toString()
	{
		return "wt="+wt;
	}
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Halwa)
			if(this.wt==((Halwa)obj).wt)
			return true;
			return false;
	}
	public int hashcode()
	{
		return wt * 5 * 7 * 11 * 13 * 17;
	}
	
}

public class Demo95 {
	public static void main(String[] args) {
		
		Halwa h1=new Halwa(500);
		Halwa h2=new Halwa(600);
		Halwa h3=new Halwa(500);
		System.out.println("*************");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println("----------------");
		System.out.println(h1==h2);
		System.out.println(h1==h3);
		System.out.println("---------------");
		System.out.println(h1.equals(h2));
		System.out.println(h2.equals(h3));
		System.out.println("**********");
		System.out.println(h1.hashcode());
		System.out.println(h2.hashcode());
		System.out.println(h3.hashcode());
		System.out.println("--------------------");
		
		/*System.out.println(h3.);
		System.out.println(h1.Integer.hashCode(h1));*/
		System.out.println(h1==h3);
	}

}
