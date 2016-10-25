package Rough;

public class bubblesort {

	public static void main(String[] args)
	{
		int arr[]={56,45,78,12,10};
		for(int a:arr){
			System.out.print(a+",");
		}
			
		BubbleSort(arr);
	for(int temp: arr)
	{
		System.out.println(temp);
	}
		}
		
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


