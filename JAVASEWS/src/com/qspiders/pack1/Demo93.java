package com.qspiders.pack1;

class Jammun
{
	
}

public class Demo93 {
	public static void main(String[] args) throws ClassNotFoundException {
	
		Class cls=Class.forName("com.qspiders.pack1.Jammun"); //change the JRE to 1.7 and c the same pgrm.
		System.out.println(cls.hashCode());
		System.out.println(cls.getName());
		
		Jammun j1=new Jammun();
		Class cls1=j1.getClass();
		System.out.println(j1.hashCode());
		System.out.println(cls1.getName());
		System.out.println(j1);
		
		System.out.println(cls1.getName()+"@"+Integer.toHexString(j1.hashCode()));
		
		Jammun j2 = new Jammun();
		Class cls2=j2.getClass();
		System.out.println(j2.hashCode());
		System.out.println(j2);
		System.out.println(cls2.getName()+"@"+Integer.toHexString(j2.hashCode()));
	}
}
