package InterviewQsandAs;

public class FloydsTriangle {
	public static void main(String[] args) {
	
		int i,j,n;
		for(i=1;i<=5;i++)
		{
			for(j=i,n=1;n<=i;n++,j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println("");
		}
	}
}
