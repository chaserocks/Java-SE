package PCLJava;

public class noofOcurnMethod {
public static void main(String[] args) {
	String s1="I love Java, and Java is my Java";
	String s2="Java";
	System.out.println(countWordOccurances(s1, s2));
}
	static int countWordOccurances(String s1,String s2)
	{
		int index=0;
		int pos=0;
		int count=0;
		
		while(s1.indexOf(s2, index)!=-1)
		{
			count++;
			index=s1.indexOf(s2,index) + s2.length();	
		}
		
		System.out.println("No.of occurence are"+ " " +count);
		return count;
	}
}

