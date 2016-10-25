package Aug08;

public class divisibleby5andCountnos{ 

	public static void main(String[] args) {
		
		System.out.println("Odd Numbers which are divisible by 5 and with in the range of 100 are:");
		int n=100;
		int count=0;
		for( int i=1;i<=n;i++)
		{
			
			if(i%5==0 && i % 2 !=0)
			{
				System.out.print(i+" ");
				count=count+1;	
			}
		}	
		System.out.println();
		System.out.println("total nos:"+count);
	}
}	

