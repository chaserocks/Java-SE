package Aug01;

//8. String toUpperCase example and toLowerCase

import java.util.Scanner;

public class UppertoLowerCaseVv {
public static void main(String[] args) {
	
	char ch;
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter any UpperCase letters..? ");
    String str=sc.nextLine();
    
	StringBuffer sb=new StringBuffer();
	
	// Upper Case :
	System.out.println("Return Value: "+ str.toLowerCase());
	
	 System.out.println("Enter any LowerCase letters..? ");
	 String str1=sc.nextLine();
	    
	// Lower Case :
	System.out.println("Return Value: "+ str1.toUpperCase());
	
	System.out.println("*************");
	
	// WAP to change the case of a character to opposite case in a given String?
	
	 System.out.println("Enter any Case letters..? ");
	 String str2=sc.nextLine();
	 
	for(int i=0;i<str2.length();i++)
	{
		ch=str2.charAt(i);
		if(Character.isLetter(ch))
		{
			ch=str2.charAt(i);
			if(Character.isUpperCase(ch))
			{
				sb.append(Character.toLowerCase(ch));
			}
			else
			{
				sb.append(Character.toUpperCase(ch));
			}
			System.out.println("input:"+str2);
			System.out.println("Output:"+sb);
		}
		
	}
 }
}
