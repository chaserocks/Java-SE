package com.qspiders.pack1;

public class Demo98 {

		public static void main(String[] args) {
	
			String s1="Hellolloo";
			System.out.println(s1.length());
			System.out.println(s1.concat("Hello"));
			System.out.println(s1);
			String s2=new String();
			System.out.println(s2.length());
			System.out.println(s2.isEmpty());
			System.out.println(s2=s2.concat("Hello"));
			System.out.println(s2.length());
			System.out.println(s2.isEmpty());
            
			System.out.println("**********");
			
			s1="Hello"; // this creates a new object.
			
			System.out.println(s1.contains("Deve")); //false, change the JRE_1.7 and check
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(null));
			System.out.println(s1.equals(s1));
			System.out.println("Hello".equals("Hello"));
			System.out.println(s1.equals("Hello"));
			System.out.println(new String("Hello").equals(new String("Hello")));
			
			System.out.println(s1.equalsIgnoreCase("HELLO"));
			
			s1="JavaDeveloper"; // this creates a new object.
					System.out.println(s1.indexOf('D')); //4, char
					System.out.println(s1.indexOf("Deve"));// string 
					System.out.println(s1.indexOf('Z'));// -1, means the character Z doesn't present
					System.out.println(s1.indexOf("e", 0)); // first occurence of e and from J(0) to D(5) 
					System.out.println(s1.indexOf("e", 6));// second occurence of e and from J(0) to v(7)
					System.out.println(s1.indexOf("e", 8));// third occurence of e and from J(0) to p(11).
					System.out.println(s1.indexOf("o", 6)); //
					System.out.println(s1.indexOf("D", 1));
					
			
	
	}

}
