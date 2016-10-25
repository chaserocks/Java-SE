package PCLJava;

import java.util.Scanner;

public class AmstrongNo {
		public static void main(String[] args) {
				int n, sum=0, temp, r;
				Scanner in=new Scanner(System.in);
				System.out.println("Enter a no. to check if it is an amststrng no.");
				n=in.nextInt();
				temp=n;
				while(temp !=0)
				{
					r=temp%10;
					sum=sum+ r*r*r;
					temp=temp/10;		
				}
				if(n==sum)
				System.out.println("The Entered no. is a amstrong no.");
				else
					System.out.println("Entered no. is not an amstrong no.");
				
		}
}
