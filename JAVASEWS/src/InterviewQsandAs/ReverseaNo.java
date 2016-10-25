package InterviewQsandAs;

public class ReverseaNo {
	public static void main(String[] args) {
		int original=1234;
		StringBuffer reverse=new StringBuffer();
		String str=Integer.toString(original);
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse.append(str.charAt(i));
		}
		System.out.println("Reverse of the No."+ reverse.toString());
		System.out.println();
	}
}
