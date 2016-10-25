package Jul28;

//4.Write program to sort an integer array without using API methods?

public class SortIntofanArrayWOAPImethod1 {
	
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
			
			   public static void main(String args[]){
				
			        SortIntofanArrayWOAPImethod1 s=new SortIntofanArrayWOAPImethod1();
			         
			        int[] num = {5,1,4,9,6,2,8,3,7};
			       
					int nos[]=s.sortToArray(num);
					
					System.out.println("sorted array is");
			        for(int i=0;i<nos.length;i++)
			        {	        	
			        	System.out.println(nos[i]);
			        }
			        
			   }
			}
