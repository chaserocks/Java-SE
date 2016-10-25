package InterviewQsandAs;

public class AnotherwaytocreateA3by3Matrix {
public static void main(String[] args) {
//	This is by means of two Arrays:
	
	int arr[][]=new int[3][3];
	int val=10;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			arr[i][j]=val;
			val+=10;
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
  }
}
