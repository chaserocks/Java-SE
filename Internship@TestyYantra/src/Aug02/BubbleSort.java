package Aug02;

import java.util.Scanner;

// WA Java Prgrm for Bubble Sort(Ascending Order) ..?

public class BubbleSort {
	
	public static void main(String[] args) {
		
	int num, temp;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no.of elements in an Array..?");
		num=input.nextInt();
	
		int [] nos=new int[num];
	
			for(int i=0;i<nos.length;i++)
			{
				nos[i]=input.nextInt();
			
				for(int j=i+1; j< nos.length;j++)
				{	
					if(nos[i] > nos[j])  // change to < for Descending order
					{
						temp=nos[i];
						nos[i]=nos[j];
						nos[j]=temp;	
					}
				}
				for(int k=0;k<nos.length;k++)
				{
					System.out.print(nos[k]); 
				}
					System.out.println();
	  }
	}
}
