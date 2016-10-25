package PCLJava;

public class ABseries {
	
	public static void main(String[] args) {
		
		String s = "ABCDE";

			int i = s.length();

			for (int x = 0; x < i; x++) 
			{
				for (int y = x + 1; y < i; y++) 
				{
					char a = s.charAt(x);
					char b = s.charAt(y);
                      String sb = new StringBuilder().append(a).append(b).toString();

					System.out.println(sb);
				}
		    }
	}
}
