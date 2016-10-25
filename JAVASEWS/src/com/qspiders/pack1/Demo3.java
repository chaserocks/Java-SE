package com.qspiders.pack1;

class A
{
	int i=100;
	public String toString()
	{
		return "i="+i;
	}
}
public class Demo3 {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1);
		System.out.println(a1.toString());
	}
		
	}