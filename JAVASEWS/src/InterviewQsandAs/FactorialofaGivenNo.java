package InterviewQsandAs;

public class FactorialofaGivenNo {
	public static void main(String[] args) {
		int num=5;
		int fact=1;
	System.out.println("Factorial of "+num);
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		}		
	}
