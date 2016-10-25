package PCLJava;

public class tringletopdown {
	public static void main(String[] args) {
		int cntr=10;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(cntr-- +" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int cntr1=10;
		for(int i=4;i>=1;i--)
		{
			for(int k=4-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(cntr1-- +" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=8;i>=1;i--)
		{
			for(int k=8-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}
  }


