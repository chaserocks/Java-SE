package StringManipulations;

public class CheckString {
public static void main(String[] args) {
		
		String str="aabbbcdefacaebdf";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char c=ch[i];
			int f=0;
			for(int j=0;j<ch.length;j++)
			  {
				if(c==ch[j])
					f++;
			   }
			if(i==0)
			  {
				System.out.println("for "+c+" is repeating for "+f+ "times");
				continue;
			   }
			boolean flag=true;
			for(int k=i-1;k>=0;k--)
			  {
				if(c==ch[k])
				{
					flag=false;
				}
		   	   }
			  if(flag)
			  {
				  System.out.println("for "+c+" is repeating for "+f+ "times");
			  }
  }		
 }
}
