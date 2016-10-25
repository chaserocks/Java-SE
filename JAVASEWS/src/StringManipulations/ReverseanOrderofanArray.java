package StringManipulations;
//How to Reverse an Order of an Array ?
public class ReverseanOrderofanArray {
	public static void main(String[] args) {
		int[] arr={10,2,14,78,3};
		System.out.println("Before Reverse:");
		for(int value1:arr)
		{
			System.out.print(value1+" ");
		}
		System.out.println();
		// Main Code:
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println("After Reverse:");
		for(int value2:arr)
		{
			System.out.print(value2+" ");
		}
	}


}
