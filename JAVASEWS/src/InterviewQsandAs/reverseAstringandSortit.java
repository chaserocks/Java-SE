package InterviewQsandAs;

import java.util.Arrays;
// WAP to reverse a String and also Sort the String characters alphabetically.
public class reverseAstringandSortit {
	public static void main(String[] args) {
		// Reversing the String :
		String str="hello mbc";
		StringBuffer str1=new StringBuffer(str);
		System.out.println(str1.reverse());
		
		//to put it in a String
		str=str1.reverse().toString();
		System.out.println(str);
		
		//code to Sort 
		char[] charArray=str.toCharArray();
		Arrays.sort(charArray);
		str=new String(charArray);
		System.out.println(str);
		
	}

}
