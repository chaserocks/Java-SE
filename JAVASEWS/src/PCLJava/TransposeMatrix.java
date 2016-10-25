package PCLJava;

public class TransposeMatrix {

	public static void main(String[] args) {
		System.out.println("Before Transpose");
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
		System.out.println("Before Transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
				
				//System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println("After Transpose");
		
		int temp;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<i;j++)
			{
				temp=arr[j][i];
				arr[j][i]=arr[i][j];
				arr[i][j]=temp;
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