package StringManipulations;

public class StringArray {
	public static void main(String[] args) {
		
		String str[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
		
		int sum=0;
		int n=Integer.parseInt("12345");
		while(n!=0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		while(sum!=0)
		{
			int j=sum%10;
		}
		System.out.println(str);
	}
}
