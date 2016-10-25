package InterviewQsandAs;

public class swapintergervaluesPresentinaString {
public static void main(String[] args) {
	String s1="10";
	String s2="20";
	System.out.println("s1="+s1);
	System.out.println("s2="+s2);
	
	s2=Integer.toString(Integer.parseInt(s1)+Integer.parseInt(s2));
	s1=Integer.toString(Integer.parseInt(s2)-Integer.parseInt(s1));
	s2=Integer.toString(Integer.parseInt(s2)-Integer.parseInt(s1));
	
	System.out.println();
	
	System.out.println("s1="+s1);
	System.out.println("s2="+s2);
}
}
