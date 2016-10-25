package InterviewQsandAs;

import java.util.Scanner;

public class TriangleOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of Rows");
		int numRow=sc.nextInt();
		
		        for(int i=1;i<=numRow;i++)
		        { // Print the Blank Spaces
		            for(int j=1;j<=numRow-i;j++)
		            {
		                System.out.print(" ");
		            }
		            // Prints the value of the number
		            for(int k=1;k<=i;k++)
		            {
		            	System.out.print("1 ");
		            }
		            System.out.println();
		        }
		    }
		}
	

