package InterviewQsandAs;

public class bubblesort {
	public static void main(String[] args) {

		int temp;
		int num[]={5,8,1,9};
//		boolean flag=true; // set flag to true to begin first pass
//		int temp = 0; // holding the variable.
		
			for(int i=0;i<num.length;i++)
			{
				for(int j=i+1; j< num.length;j++)
				{
					if(num[i] > num[j])// change to > for ascending order
					{
						temp=num [i];
						num[i]=num[j];
						num[j]=temp;	
					}
				}
				for(int k=0;k<num.length;k++)
				{
					System.out.print(num[k]);
				}
				System.out.println();
	  }
	}		
}
