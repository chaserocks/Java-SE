package InterviewQsandAs;

public class FactorialRecursion {
	
	public static int fact(int n){

	{
		if (n==1)  // this block is very imp. 
			return 1;
		return n * (fact(n-1));
	}
}
		public static void main(String[] args)
		{
			System.out.println(fact(7));
		}
}
