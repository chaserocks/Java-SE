package com.qspiders.pack1;

public class Demo101 {
	public static void main(String[] args) {
		
		int i=100;
		Integer intObj1=new Integer(i); // auto boxing
		System.out.println(intObj1);
		
		int j=intObj1.intValue(); // unboxing
		System.out.println(j);
		
		double d=intObj1.doubleValue(); // unboxing and auto widening
		System.out.println(d);
		
		//1st way:
		
		Double dd=new Double(d); // boxing
		System.out.println(dd);
		
		//2nd way:
		
		Double dd1=d; //boxing
		System.out.println(dd1);
		
		System.out.println("unboxing");
		
		int i1=dd1.intValue(); // unboxing and narrowing
		System.out.println(i1);
		
		System.out.println("unboxing and explicit narrowing");
		
		int i2=(int)dd1.doubleValue();
		System.out.println(i2);
		
		byte b=123;
		
		Long ll=new Long(i); // i , auto widening
		Long ll1=new Long(b); // b, auto widening
		
		System.out.println(ll);
		System.out.println(ll1);
		
		long l=100;
		Byte bb=new Byte((byte)l);
		System.out.println(bb);
		
		System.out.println("converting object to string");
		
		String s1=ll.toString();
		System.out.println(s1);
		
		System.out.println("**************");
		
		Double dd2=new Double(100);
		String s2=dd2.toString(); // object toString
		System.out.println(s2);
		
		Double.toString(10.22); // primitive toString
		Long.toString(100l);
		Byte.toString((byte)100);
		//String s2=ll; // cannot convert from Long to String ; assigning ll address to s2.
		//add two string containing numbers and put in another string.
		
		/*String s33=Integer.toString(Integer.parseInt(s1)+Integer.parseInt(s2));
		System.out.println(s33);*/
		
		Integer ii=new Integer(123);
		Integer ii2=ii; // assigning the address
		System.out.println(ii==ii2);// true
		System.out.println(ii2);
		System.out.println(ii);
		
		Integer ii3=Integer.valueOf(ii); // returning an new Integer object.
		System.out.println(ii==ii3); // false
		
		Short sh1=new Short((short) 100);
		String s21=sh1.toString();
		System.out.println(s21);
		
		Short sh2=new Short((short) 200);
		String s22=sh2.toString();
		System.out.println(s22);
		
		String s33=Short.toString((short) (Short.parseShort(s21)+Short.parseShort(s22)));
		System.out.println(s33);
		
	}
}
