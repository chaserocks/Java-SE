package Jul28;

//4.Write program to sort an integer array without using API methods?

import java.util.Scanner;
public class SortIntofanArrayWOAPImethods {
	
			public int[] sortToArray(int []num)
			   {
			       int len=num.length;
			       int temp;
			       
			       for(int i=0;i<len-1;i++)
			       {
			          for(int j=0;j<len-1;j++)
			          {
			               if(num[j]>num[j+1])
			               {
			            	   temp=num[j+1];
			                   num[j+1]=num[j];
			                   num[j]=temp;
			               }
			          }
			       }
			       return num;
			   }
			
			   public static void main(String args[])
			   {
				   int num;
					Scanner input=new Scanner(System.in);
					System.out.println("Enter the no.of elements in an Array..?");
					num=input.nextInt();
				
			        SortIntofanArrayWOAPImethods s=new SortIntofanArrayWOAPImethods();
			         
//			        int[] num = {1,4,2,3};
			        
			    	int [] nos=new int[num]; 
//			     	int nos []=s.sortToArray();
					
//					
			      
			        	for(int j=0;j<nos.length;j++)
			        	{
			        		nos[j]=input.nextInt();
			        	}
			        	System.out.println("sorted array is");  
			        	  for(int i=0;i<nos.length;i++)
					        {
			        		  System.out.println(nos[j]);
					        }
			        }
			        
			   }
			
