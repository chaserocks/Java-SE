package InterviewQsandAs;
// WAP to change the case of a character to opposite case in a given String?
public class changethealphacasetoOppositecase {
	public static void main(String[] args) {
		char ch;
		String str="ThiS is CrAzY";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
				ch=str.charAt(i);
				if(Character.isUpperCase(ch))
				{
					sb.append(Character.toLowerCase(ch));
				}
				else
				{
					sb.append(Character.toUpperCase(ch));
				}
				System.out.println("input:"+str);
				System.out.println("Output:"+sb);
			}
			
		}
	}

}
