package InterviewQsandAs;
// WAP to Print Fibonacci Series from 1 to 100?
public class FibonacciSeries1to100 {

	public static void main(String[] args) {
		int first =0;
		int second=1;
		int next=1;
		System.out.print(first+","+ second);
		int maxval=100;
		while(first+second<=maxval)
		{
			next=first+second;
			System.out.print(","+next);
			first=second;
			second=next;
		} 			
	}
}

