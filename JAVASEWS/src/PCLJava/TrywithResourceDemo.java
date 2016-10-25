package PCLJava;

import java.util.Scanner;

//which ever u can use the resources like file input and scanner e.t.c. try with resources

public class TrywithResourceDemo {
		public static void main(String[] args) {
			try(Scanner sc=new Scanner(System.in))
			{
				System.out.println("enter any word:");
				int i=sc.nextInt();
			}
			catch(Exception e)
			{
				
			}
		}
}
 //we have resource inside the parenthesis() of try block, compiler will internally convert try with resources to try finally block.
 // if catch is present it will be retained.
 // once work is done resources are automatically closed, don't close it explicitly.