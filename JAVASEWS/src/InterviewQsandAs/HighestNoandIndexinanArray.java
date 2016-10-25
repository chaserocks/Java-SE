package InterviewQsandAs;

public class HighestNoandIndexinanArray {
	public static void main(String[] args) {
		int arr[]={3,5,8,1,7,2};
		int highest=arr[0];
		int index=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>highest)
			{
				highest=arr[i];
				index=i;
			}
		}
		System.out.println("Highest number:"+highest);
		System.out.println("At the index:"+index);
	}

}
