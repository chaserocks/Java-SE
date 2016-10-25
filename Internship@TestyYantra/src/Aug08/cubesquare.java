package Aug08;
//5.Write a program to print perfect number which are square of a number as well cube between 0 to 1000. EX: 1, 64, 729 which is cube of 4 and square of 8 for 64.
public class cubesquare {
	
	public static void main(String[] args)
	{
		for (int i=1; i<35; i++)
		{	int  x=i;
			int square= x*x;
			for (int j=1;j<35;j++)
			{
				int y=j;
				int cube = y*y*y;
				
				if (square== cube)
				{
					System.out.println(cube);
				}
			}
		}
	}
}
