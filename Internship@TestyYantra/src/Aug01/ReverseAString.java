package Aug01;

// 7. Reverse a string using Java ?

import java.util.Scanner;

public class ReverseAString {
	
	public static void main(String[] args) {
	
	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a name..?");
		String	s1=input.nextLine();
		
	
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println("***************************");
		
//			Another Ways: 
			
//		Scanner input=new Scanner(System.in);
		System.out.println("Enter a name..?");
		String	str1=input.nextLine();
		
		char[] arr = str1.toCharArray();
		int len = arr.length;
		for(int i=0;i<len;i++) {
			char tempo;
			tempo = arr[i];
			arr[i]=arr[len-1];
			arr[len-1]=tempo;
			len--;
		}
		
		String revStr = String.copyValueOf(arr); //this is a better option
		
//		String revStr = new String(arr);
		System.out.println("Reversed string: " + revStr); 

 }
}
