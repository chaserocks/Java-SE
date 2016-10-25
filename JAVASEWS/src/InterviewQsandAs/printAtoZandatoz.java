package InterviewQsandAs;
//WAP to print A-Z and a-z 
public class printAtoZandatoz {

	public static void main(String[] args) {
		for(char ch='a';ch<='z';ch++)
		{
			System.out.print(ch+"  ");
	    }
		System.out.println();
		
		for(char ch1='A';ch1<='Z';ch1++)
		{
			System.out.print(ch1+"  ");
		}
		System.out.println();
		
		for(int i=1;i<=26;i++)
		{
			System.out.print(i+" ");
		}
	}
}
