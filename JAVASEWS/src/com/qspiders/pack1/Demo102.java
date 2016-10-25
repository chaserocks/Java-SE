package com.qspiders.pack1;

 class D
{
	void test(double d)
	{
		System.out.println("double arguments method");
	}
	
	void test(Integer intObj)
	{
		System.out.println("Integer argument method");
	}
	
	void test(Number num)
	{
		System.out.println("Number arguments method");
	}
	
	void test(Object Obj)
	{
		System.out.println("Object argument method");
	}
	
	void test(int d)
	{
		System.out.println("int argument method");
	}
}
 // preference if the int argument methods execution: same type(primitive), auto widening,wrapper classes, number class and object class. 
 class Demo102 {
           public static void main(String[] args) {
			D d1=new D();
			d1.test(10);
			d1.test((double)10);
			d1.test((Number)10);
			d1.test(d1);	
		}
}
