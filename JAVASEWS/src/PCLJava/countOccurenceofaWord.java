package PCLJava;
//write a method to count the occurrences of a word in the sentence.
public class countOccurenceofaWord {
	public static void main(String[] args) {
		String s1="I love Java, and Java is my Java";
		String s2="Java";
				//System.out.println(s1.indexOf("Java", 11));
		int index=0;
		int pos=0;
		int count=0;
		while(s1.indexOf(s2, index)!=-1)
		{
			pos=s1.indexOf(s2, index)+1;
			System.out.println("Position"+ pos);
			count++;
			index=pos-1 + s2.length();	
		}
		System.out.println("No.of occurence are"+ " " +count);
		
		
	}
}
