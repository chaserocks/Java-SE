package PCLJava;

public class VerifyPassword {
	public static void main(String[] args) {
		System.out.println(verifyPassword("P@ssw0rD")?"Valid Password":" Invalid Password");
		System.out.println(verifyPassword("")?"Valid Password":" Invalid Password");
		System.out.println(verifyPassword("P@sswo rD")?"Valid Password":" Invalid Password");
	}
	
	static boolean verifyPassword(String pwd)
	{
		int capcnt=0;
		int nocnt=0;
		int spcharcnt=0;
		int alphacnt=0;
		
		char ch=0;
		
		if(pwd.length()!=8)
			return false;
				else
			{
				for(int i=0;i<pwd.length();i++)
				{
					ch=pwd.charAt(i);
					if((ch>=65 && ch<=90||(ch>=97 && ch<=122)))
					{
						alphacnt++;
						if((ch>=65 && ch<=90))
							capcnt++;
					}
					else if(ch>=48 && ch<=57) // 48 to 57 = 0 to 9
							nocnt++;
					else 
						spcharcnt++;
				}
				if(alphacnt>0 && capcnt>0 && spcharcnt>0 && nocnt>0)
						return true;
						return false;
					}
				}
	          }
            


	