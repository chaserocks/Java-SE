package StringManipulations;
// WAP to print largest and smallest Element in an Array?
public class largestandsmallestElemntinArray {
public static void main(String[] args) {
	int[] arr={90,5,12,56,4};
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	ystem.out.println("Largest number in the array is:"+arr[0]);
	System.out.println("Smallest number in the array is:"+arr[arr.length-1]);
  }
}
