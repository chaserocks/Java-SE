package PCLJava;

public class ExtractNoFromString {
	public static void main(String[] args) {
		//String str="You are about to delete 3 tasks. Please confirm.";
		String str="You are about to delete 43 tasks.Please confirm.";
		String str2="";
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				//System.out.println(ch);
				str2=str2+ch;				
			}
		}
		System.out.println(str2);
		
		System.out.println("******Regular Expression way***********");
		   
		String number= str.replaceAll("[^0-9]", "");
			System.out.println(number);	 
	}
	
}
