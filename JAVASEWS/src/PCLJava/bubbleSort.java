package PCLJava;

import java.util.Arrays;

public class bubbleSort
{

	public static void main(String[] args)
	{
		int arr[]={56,45,78,12,10};
		System.out.println(Arrays.toString(arr));
		
		//try{
			
		BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		}
		//catch(ArrayIndexOutOfBoundsException e)	{
		
		//}
		//	System.out.println("**************");
			
			/*int arr1[]={56,54,27,87,23};
			System.out.println(Arrays.toString(arr1));	
			
			BubbleSort1(arr1);
			System.out.println(Arrays.toString(arr1));
	}*/

		public static void BubbleSort(int[] num)
		{
			int j;
			boolean flag=true; // set flag to true to begin first pass
			int temp = 0; // holding the variable.
			while (flag)
			{
				flag=false; // set flag to false awaiting a position swap
				
				for(j=0;j < num.length-1;j++) // 
				{
					if(num[j] > num[j+1]) // change to  < for descending sort order
					
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					flag=true; //show a swap occurred.
				}
			}
			
		}
}
		
	/*public static void BubbleSort1(int[] num)
	{
		int j;
		//boolean flag=true;
		int temp; // holding variable
		
		for(int i=0;i<num.length;j++)
		{
			for(j=0; j< num.length-1;j++)
			{
				if(num[j] > num[j+1])// change to > for ascending order
				{
					temp=num [j];
					num[j]=num[j+1];
					num[j+1]=temp;	
				}
			}
		}
	}
		
  }
*/