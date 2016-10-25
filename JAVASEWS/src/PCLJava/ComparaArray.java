package PCLJava;

import java.util.Arrays;

public class ComparaArray {

	public static void main(String[] args) {
		
		int [][] arr1={{5,9},{2,6}};
		int [][] arr2={{1,2},{3,4}};
		
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j]>arr2[i][j]) 		
				System.out.print(arr1[i][j]);
				System.out.println(arr1[i][j]);
				else
				System.out.print(arr2[i][j]);
				System.out.println(" ");
			}	
			System.out.println();
    	}			
  }
}
