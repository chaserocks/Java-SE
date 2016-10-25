package PCLJava;

import java.util.Arrays;

//swapping is easy way....
public class ReverseArray {
 public static void main(String[] args) {
	 
	 int arr[]=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
//		int arr[]={10,20,30,40};
		
		System.out.println(Arrays.toString(arr));
		
		int temp=0;
			
		for(int i=0;i<arr.length-1;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(arr));

		}	
 }
