package PCLJava;
// FlippedTriangle.
public class flippedtriangle {

	
	public static void main(String[] args) {
		int rows=4;
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
		}
			
			

	}

}
