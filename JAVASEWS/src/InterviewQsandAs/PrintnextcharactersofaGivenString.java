package InterviewQsandAs;

public class PrintnextcharactersofaGivenString {
	
	public static void main(String[] args) {
		String str="Selenium";
		StringBuffer str1=new StringBuffer();
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			char ch=arr[i];
			str1=str1.append(++ch);
		}
		System.out.println(str1);
	}

}
