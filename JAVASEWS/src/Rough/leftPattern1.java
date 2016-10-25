package Rough;

public class leftPattern1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print("-");  // for right pattern change to "#"
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("#"); // change to "-"(spaces)
			}
			System.out.println();
		}
		
		
		
	}
	
}
