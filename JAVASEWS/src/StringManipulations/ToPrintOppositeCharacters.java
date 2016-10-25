package StringManipulations;

public class ToPrintOppositeCharacters {
	public static void main(String[] args) {
		
	String str="BhaRatH is Smart";
	char[] chararray=str.toCharArray();
	StringBuffer strbuf=new StringBuffer();
	for(char ch:chararray)
	{
		if(Character.isLetter(ch))
		{
			if(Character.isUpperCase(ch))
				strbuf.append(Character.toLowerCase(ch));
			else
				strbuf.append(Character.toUpperCase(ch));
		}
	else
		strbuf.append(ch);
	}
		System.out.println(str);
		System.out.println(strbuf);
	}	
}
