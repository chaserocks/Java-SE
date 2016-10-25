package InterviewQsandAs;
// WAP to Create 3*3 Matrix (3 by 3)?
public class createA3by3Matrix {
	// Refer the diff patterns file in e:\javasw
		public static void main(String[] args) {
			int Val=10;
			for(int i=1;i<=3;i++) // outer loop: represents rows(for loop)
			{
				for(int j=1;j<=3;j++) // inner loop: represents columns(nested for loop)
				{
					System.out.print(Val+" ");
					Val+=10;		
				}
				System.out.println();
			}
	 }
}


