package InterviewQsandAs;

public class LowestNoandIndexinanArray {

	public static void main(String[] args) {
		int arr[]={3,5,8,1,7,2};
		int lowest=arr[0];
		int index=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<lowest)
			{
				lowest=arr[i];
				index=i;
			}
		}
		System.out.println("Lowest number:"+lowest);
		System.out.println("At the index:"+index);
	}

}

