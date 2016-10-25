package InterviewQsandAs;

//WAP to sort the numbers and the alphabets from a given String?
public class sortAlphaANDnumbers {
	public static void main(String[] args) {
		{
			String str="mbc2365thenice";
			char[] charArray=str.toCharArray();
			StringBuffer str1=new StringBuffer();
			StringBuffer str2=new StringBuffer();
			for(char ch:charArray)
			{
				if(Character.isDigit(ch))
				{
					str1=str1.append(ch);
				}
				else
				{
					str2=str2.append(ch);
				}
				
			}
			System.out.println(str1);
			System.out.println(str2);
		}
	}

}
