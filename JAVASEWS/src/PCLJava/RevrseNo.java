package PCLJava;

public class RevrseNo {
	public static void main(String[] args) {
		int rem,i=1234;
		int reverse=0;
    while(i>0)
		{
			int remainder=i%10;
			reverse=remainder+reverse*10;
			i=i/10;
    	}
		System.out.println(reverse);
	}
}

