package InterviewQsandAs;

public class DivideANoWOdivideOperator {
public static void main(String[] args) {

	int number=26;
	int divisor=5;
	int result=0;
	while((number-divisor)>0)
	{
		result++;
		number=number-divisor;
	}
	System.out.println(result);
}
}
