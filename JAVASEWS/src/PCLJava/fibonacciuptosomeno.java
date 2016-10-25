package PCLJava;

public class fibonacciuptosomeno { // up to no=20. 

	public static void main(String[] args) {
		int first =0;
		int second=1;
		int next=1;
		System.out.print(first+","+ second);
		int cntr=3;
		while(cntr<=20)
		{
			next=first+second;
			System.out.print(","+next);
			first=second;
			second=next;
			cntr++;
		} 			
	}
}
