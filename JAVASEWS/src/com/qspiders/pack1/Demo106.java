package com.qspiders.pack1;

public class Demo106 {
	public static void main(String[] args) {
		
	/*StringBuffer sb1=new StringBuffer();
	sb1.append("Hello");
	System.out.println(sb1);*/
		//or
		StringBuffer sb1=new StringBuffer("Hello");
		System.out.println(sb1);
		sb1.append("Banglore");
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		StringBuffer sb2=new StringBuffer("Bangalore");
		System.out.println(sb2.reverse()); // prints in reverse direction of the characters.
		System.out.println(sb2);
		
		sb2.setLength(0);
		System.out.println(sb2.length());
		System.out.println(sb2); // nothing it prints becz it was cleared.
//or
//		sb2.delete(0, sb2.length());
//		System.out.println(sb2.length());
//		StringBuffer sb3=new StringBuffer();
		
		System.out.println("-----------");
		
		StringBuffer sb4=new StringBuffer();
		sb4.length();
		System.out.println(sb4.length());
		
	    sb4.append("JavaDeveloper"); //  and concade(is used in String class) and append are the same,append: add at the end. is used in the buffer class.
	    sb4.insert(4, "haha");
	    System.out.println(sb4);
	    sb4.delete(4, 6); // here 4 is the index and 6 is the position(start from the 1). deletes the characters as per the start index and end index.
	    System.out.println(sb4);
	    
	    System.out.println(sb4.deleteCharAt(4)); // 5th char is deleted.
	    
	    sb4.replace(0, sb4.length(),"India&Mandya"); // count from 0 (since it starts with the index)
	    System.out.println(sb4);
	    sb4.replace(4, 5, "A"); // 4th index and 5th position refers to the same character.
	    System.out.println(sb4);
	    
	    StringBuilder sb5=new StringBuilder("Selenium");
	    System.out.println(sb5);
	    StringBuilder sbl;
	    System.out.println(sbl=sb5.insert(4, "Haha"));
	    System.out.println(sb5);
	    
	    System.out.println("------------");
	    
	    System.out.println(sb5==sbl);
	    System.out.println(sb5.equals(sbl));
	    System.out.println("------------");
	    
	    System.out.println(sb5.reverse());
	    sb5.reverse();
	    System.out.println(sb5);
	    System.out.println(sb5.delete(3, 7)); //eHah will be deleted. 4 characters will b deleted.

	    // String s=sbl; // not possible since they are of different class.
	    //assigning StringBuffer content to String class.
	    String s1=sb5.toString();
	    //assigning the String to StringBuffer class.
	    StringBuffer sb6=new StringBuffer("Hello"); // 1st way or
	    sb6.append("fellow"); // 2nd way.
	    
	    // how do u convert StringBuffer to a string.

	    //how do u convert String to StringBuffer.
	    // String to StringBuffer constructor and pass the values.... or u can append the String.
	    
	    String s2="Bharath";
	    StringBuffer sb7=new StringBuffer(s2);
	    sb7.reverse();
	    s2=sb7.toString();
	    System.out.println(s2);
	    
	    String s3=new StringBuffer(s2).reverse().toString();
	    System.out.println(s3);
	    
	    String s4=new StringBuffer(s2).replace(1, 4, "y").toString(); // here it considers s2 value and  from (h)1 to 4(3 letters will be replaced by the letter 'y') 
	    System.out.println(s4);
	    
	    
	    
	    
	    
	}
}
