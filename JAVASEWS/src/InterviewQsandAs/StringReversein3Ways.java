package InterviewQsandAs;
// WAP to reverse a given String with reverse() and without reverse() in (3 Ways)?
public class StringReversein3Ways {
public static void main(String[] args) {
	//original String
	String str="JingiLalaa";
	
	// 1st way reversing the String using the StringBuffer
	String strRev=new StringBuffer(str).reverse().toString();
	System.out.println("Reversed String Using StringBuffer:"+strRev);
	System.out.println();
	
	// 2nd way reversing the string iterative method to reverse String in Java
	strRev=reverse(str);
	System.out.println("Reverse String using iterator in java:"+strRev);
	
	System.out.println();
	// 3rd Way Recursive Method to reverse String in Java
	strRev=strReverseRecursion(str);
	System.out.println("Reverse String in Java using Recursion:"+strRev);
}
 
//2nd way
private static String reverse(String str) {
	StringBuilder strBuilder=new StringBuilder();
	char[] charArr=str.toCharArray();
	for(int i=charArr.length-1;i>=0;i--)
	{
		strBuilder.append(charArr[i]);
	}
	return strBuilder.toString();
}

//3rd way 

public static String strReverseRecursion(String str)
{
	if(str.length()<2)
	{
		return str;
	}
	return strReverseRecursion(str.substring(1))+str.charAt(0);
}
}
