package com.qspiders.pack1;

public class Demo94 {
	
	public static void main(String[] args) {
		
			int i=100;
			System.out.println(i);
			
			Integer ii=new Integer(i);
			System.out.println(ii);
			
			Integer ii1=new Integer("100"); //auto boxing. by passing the primitive value to a wrapper class
			System.out.println(ii1); //converting the primitive variable to a wrapper type is called boxing
			
			Integer ii2=200;  // this is also possible, by the use of wrappper class.
			System.out.println(ii2);
			
			double d=12.3;
			Double dd= new Double(d);
			System.out.println(dd);
			
			Double dd1=new Double("12.3");
			System.out.println(dd1);
			
			Character c=new Character('A'); //unboxing : changing the boxed object into primitive type.
			int k=ii1.intValue();
			System.out.println(k);
			
			double d2=dd1.doubleValue(); //unboxing (by using the non static object of a wrapper class)
			System.out.println(d2);
			
			d2=ii1.intValue();
			System.out.println(d2); // auto widening
			
			k=(int)dd1.doubleValue(); //unboxing and explicitly narrowing
			System.out.println(k);
			
			/*k=(double)dd1.intValue(); 
			System.out.println(k);
			*/
					
			
	}

}
