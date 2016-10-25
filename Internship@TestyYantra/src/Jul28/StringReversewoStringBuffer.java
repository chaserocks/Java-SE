package Jul28;

//5.Write a program in Java to reverse any String without using StringBuffer?

import java.util.Scanner;

public class StringReversewoStringBuffer {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word...?");
		String str=sc.nextLine();
		
		System.out.print("String Reverse of given Word is ");
		for(int i =str.length()-1; i>=0; --i)
		 {
			System.out.print(str.charAt(i)); 
		 }
	}
}
