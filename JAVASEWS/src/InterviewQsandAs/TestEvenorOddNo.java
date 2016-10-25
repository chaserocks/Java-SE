package InterviewQsandAs;

// WAP how to identify a given positive decimal number as even/odd without using % or / operator?
//Ans: Division is a matter of  iterative subtraction.
public class TestEvenorOddNo {
public static void main(String[] args) {
	int num=6;
	int result=num;
	while(result>=2)
	{
		result=result-2;
	}
	if (result==1)
	{
		System.out.println("The No. is ODD");
	}
	else
	{
		System.out.println("The No. is EVEN");
	}
  }
}
