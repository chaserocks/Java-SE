package com.qspiders.pack1;

class B
{
	int i=100,j=200;
	public String toString()
	{
		return "i="+i+" "+"j="+j;
	}
}
public class Demo4 {
	public static void main(String[] args) {
	B b1=new B();
	System.out.println(b1);
	System.out.println(b1.toString());
	System.out.println("-----------");
	System.out.println(new B());
	System.out.println(new Demo4());// here Demo4 object was created with the address.

}
}
