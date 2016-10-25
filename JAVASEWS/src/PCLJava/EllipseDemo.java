package PCLJava;

public class EllipseDemo {
public static void main(String[] args) {
	
	System.out.println(add(new int []{10,20,30})); // passing values in the array.
	System.out.println(add1(10,20,30)); // passing values directly or values are directly passed.
}
		static int add(int[] vals)
		{
			int sum=0;
			for(int val:vals)
				sum=sum+val;
			return sum;
		}
		static int add1(int...vals) // ellipses : it is a variable no.of arguments, where u can pass the values directly.
		{
			int sum=0;
			for(int val:vals)
				sum=sum+val;
			return sum;
		}	
}
