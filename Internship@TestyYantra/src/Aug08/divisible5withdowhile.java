package Aug08;

//4. Write same above program using do while loop.

public class divisible5withdowhile {
	public static void main(String[] args) {

	System.out.println("Odd Numbers which are divisible by 5 and with in the range of 100 are:");
	
	int i=0;
	int count=0;
	do
	{
		i=i+1;
		
		if(i%5==0 && i % 2 !=0)
		{
			System.out.print(i+" ");
			count=count+1;	
		}
	}while(i<=100);
	System.out.println();
	System.out.println("total nos:"+count);
  }
 }	


