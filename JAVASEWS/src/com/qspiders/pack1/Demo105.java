package com.qspiders.pack1;

public class Demo105 {

	
	public static void main(String[] args) {
		String s1="Java";
		String s2="Developer";
		String s3=s1+s2; //created in NCP
		System.out.println("s3="+s3);
		
		String s4="Java Developer"; //created in SCP(String Constant Pool)
		System.out.println("s4="+s4);
		System.out.println(s3==s4);//false, since both created in different pools
		
		String s5="Java"+" "+"Developer"; //Created in the same SCP. already created s4, s4 will be overridden by s5.
		System.out.println("s5="+s5);
		System.out.println(s4==s5);//true
		System.out.println(s3==s5);//false, due to s3=s1+s2 which is created in NCP(non constant Pool)
		
		String s6=s1+"Developer";
		System.out.println("s6="+s6);
		System.out.println(s3==s6);//false, bcuz s6 created in NCP.
		System.out.println(s4==s6);//false
		System.out.println(s4.equals(s6));//false
		System.out.println(s3.equals(s6));//true, equals compares the strings only bt nt the address.
		
		System.out.println("********");
		System.out.println(s6.indexOf("e",8)); //
		
		System.out.println(s6.replace('e', 'E'));
		
		System.out.println(s6.charAt(7)); // finds the character number. starts from 0(J).
		
		System.out.println(s6.length()-1);
		
		char char1=s3.charAt(0);// picking a char
				System.out.println(char1);
		for(int i=1;i<=s3.length()-1;i++)// printing all the chars
			System.out.println(s3.charAt(i));
		
		for(int i=s3.length()-1;i>=0;i--)  // printing the chars in in reverse direction. 
			System.out.print(s3.charAt(i));
		System.out.println();
		
		char [] chars=s3.toCharArray(); // converting a string to a char Array.
		System.out.println(chars[0]);
		System.out.println();
		
		System.out.println("*********");
		for(int i=0;i<chars.length;i++)
			System.out.println(chars[i]);
		
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println(s1.startsWith("Java", 0)); // true
		
		System.out.println(s1.startsWith("Java")); // true
		
		System.out.println(s1.startsWith("java"));//false since becz j is small.
		
		System.out.println(s3.endsWith("per")); //true
			
		System.out.println("A".compareTo("A")); //0
		
		System.out.println("E".compareTo("A")); //4
		
		System.out.println("AC".compareTo("AB")); //1, it compares with the unicode comparsion, since A and A are same then it checks with the next string C(67) to B(66) =1.
		
		System.out.println("A".compareTo("B")); // since A(65) and B(66)= -1
		
		System.out.println("B".compareTo("A")); // since B(66) and A(65)=1
		
		System.out.println("AB".compareTo("DE")); // it always checks with the first character only that is A(65) and checks with the D(67)=-3. it willnt check with the next string.if the first string is 1 or 0 it moves to the next string.
		
		s3="BHARATH CHANDRA";
		
		for(int i=0;i<s3.length();i++)
		{
			System.out.println(s3.charAt(i) + " "+ (int)s3.charAt(i));
		}
		
		System.out.println("*************");
		
		for(int j=0;j<s3.length();j++)
		{
			System.out.println(s3.charAt(j) + " "+ (int)s3.charAt(j) + " "+ (s3.charAt(j)+1) + " "+ (char)(s3.charAt(j)+1));
		}
		
			System.out.println(new String("Hello").length());
			System.out.println("NICE".length());
			
			s3="  Hello   ";
			System.out.println(s3.length());
			s3=s3.trim();  // trims=removes only the left and right spaces.
			System.out.println(s3.length());
				
					
					s3="   Hello   ";
					System.out.println(s3.length());//11 
					System.out.println(s3.trim().length()); // s3.trim().length() this is method chaining.
					
					
					System.out.println(s4.substring(5));
					System.out.println(s4.substring(5, s4.length()));
					System.out.println(s4.substring(5, 12)); // first arg is index & 2nd arg is position..."Java Developer" =
					
					// ***string class doesn't have the reverse method.
					
					// reversing a given String of the sentences.
					s1="This is Java Class";
					System.out.println(s1.length());
					
					String [] words=s1.split(" "); // split : where ever there is a space it removes the spaces.
					System.out.println(words.length);
					
					for(int i=words.length-1;i>=0;i--) //
						System.out.print(words[i]+ " ");
					
					// StringBuilder sb1="Hello"; cannot do this .
					// Apple = new OotyApple();
					
					// StringBuffer sb1=new StringBuffer("Hello");
					//use this method to set it sb2.append("Hello"); returns to the object.
					// String Buffer sb2=new StringBuffer()
					
					
		
		}		
		
				
	}


