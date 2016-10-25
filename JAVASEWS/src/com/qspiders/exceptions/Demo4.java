package com.qspiders.exceptions;

public class Demo4 {
public static void main(String[] args) {
	Demo4 r= new Demo4();
	r.test1();
}

	void test1()
	{
		test2();
	}
	void test2()
	{
		test3();
	}
	void test3()
	{
		test4();
	}
	void test4()
	{
		int j=10/0;
	}
}

/* output: Exception in thread "main" java.lang.ArithmeticException: / by zero
at com.qspiders.exceptions.Demo4.test4(Demo4.java:23)
at com.qspiders.exceptions.Demo4.test3(Demo4.java:19)
at com.qspiders.exceptions.Demo4.test2(Demo4.java:15)
at com.qspiders.exceptions.Demo4.test1(Demo4.java:11)
at com.qspiders.exceptions.Demo4.main(Demo4.java:6)
*/