package PCLJava;

import java.util.Arrays;

public class RotateArrayForward {
	 public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int steps=1; // depending on the no.of steps it will iterate or swaps . 
		System.out.println(Arrays.toString(arr));
		rotate(arr,steps);
		System.out.println(Arrays.toString(arr));
	}
	  public static void rotate(int[] arr, int order){
		  for(int i=0;i<order;i++){
			  for(int j=0;j<arr.length-1;j++){
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
		  
	  }
	}


