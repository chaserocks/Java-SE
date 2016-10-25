package Aug02;

// WAP Java Bubble Sort (Descending Order) ..?

public class BubbleSortDescendingOrder {
	
	public static void main(String[] args) {

		int temp;
		int num[]={1,3,9,7,5,6,};
		
			for(int i=0;i<num.length;i++)
			{
				for(int j=i+1; j< num.length;j++)
				{
					if(num[i] < num[j])  // change to > for ascending order
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


