package PCLJava;

public class ReverseString {
	public static void main(String[] args) {

	String str="Bharath";
		
		/*StringBuffer sb1=new StringBuffer(str);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		// or
		System.out.println(str);
		
		System.out.println(new StringBuffer(str).reverse().toString());*/
		
		for(int i=0;i<str.length()-1;i--)
		{
			System.out.println(str.charAt(i));
		}
		/*
		int reverse=0;
    while(s1>0)
		{
			int remainder=s1;
			reverse=remainder+reverse;
			s1=s1;
			
    	}
		System.out.println(reverse);*/
	}
}
