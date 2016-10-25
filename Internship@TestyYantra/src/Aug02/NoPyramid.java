package Aug02;

// Write a code to print the following pyramid
// 0      
// 1       2      
// 3       4       5      
// 6       7       8       9      
// 10      11      12      13      14

public class NoPyramid {
	public static void main(String[] args) {
		
		int temp=0;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(temp +" ");
				temp++;
			}	
			System.out.println();
		}
	}
}

/*int rows=4;
int cntr=0; // to print the 10 digits use cntr=1
int start=0;

for(int i=1;i<=rows;i++)
{
	for(int k=1;k<=rows-i;k++)
	{
		System.out.print(" ");
	}
	
	start=cntr + i-1; // cntr + " "
	// start=cntr + " ";
	for(int j=1;j<=i;j++)
	{
		System.out.print(start);
		start--; // doesn't matter for the first time
		cntr++; //
	}
	System.out.println();
}*/