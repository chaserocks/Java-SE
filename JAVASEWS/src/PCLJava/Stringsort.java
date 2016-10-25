package PCLJava;

import java.util.Arrays;

public class Stringsort {

	public static void main(String[] args) {
		String arr[]={"Bharath","Chandra","Manchikatla","Chaserocks"};
		System.out.println(Arrays.toString(arr));
		Bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void Bubblesort(String[] num){
		int j;
		boolean flag=true; // set flag to begin first pass
		String temp; // holding variable.
		while(flag)
		{
			flag=false; //set flag to false awaiting a possible swap.
			for(j=0;j<num.length-1;j++)
			{
				if(num[j].compareTo(num[j+1])>0) //change to > for ascending order. and for descending order <.
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					flag=true;
				}
			}
		}
	}
}
