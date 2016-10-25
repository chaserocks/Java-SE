package PCLJava;

public class RevrsecharStrnBuffr {

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
		
		// alternate way:
		
		int x=1234;
		int y=0;
		int temp=0;
		
		while(x>0)
		{
			temp=x%10;
			y=y*10+temp;
			x=x/10;
		}
		System.out.println(y);
		
		// third way
		int x1=7890; // 0(zero)  will nt be printed in o/p.
		int x2=2314;
      System.out.println(Integer.parseInt(new StringBuffer(Integer.toString(x1)).reverse().toString()));
      System.out.println(Integer.parseInt(new StringBuffer(Integer.toString(x2)).reverse().toString()));
	}
}
