package PCLJava;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringDisplayArray {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a value ");
		String sc = input.nextLine();
		
		//StringBuffer sb1=new StringBuffer(input);
		char[] arr=new StringBuffer(sc).reverse().toString().toCharArray();
		System.out.println(Arrays.toString(arr));
		
	/*	System.out.println(sb1.charAt());*/
		
	}

}
