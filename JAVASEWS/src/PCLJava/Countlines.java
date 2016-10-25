package PCLJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Countlines {
	public static void main(String[] args) throws IOException
	{
		File fl=new File("e:\\grid.txt");
		FileReader flRd=new FileReader(fl);
		
		BufferedReader bufRd=new BufferedReader(flRd);
		
		String s;
		int cntlns=0;
		int cntblns=0;
		int cntedlns;
		
		while((s=bufRd.readLine())!=null)
		{
			if(s.length()>0)
			{
				System.out.println(s);
			}
			else
			{
				cntblns++;
			}
			cntlns++;
		}
		cntedlns=cntlns-cntblns;

		bufRd.close();
		System.out.println("No of lines"+ cntlns);
		System.out.println("No of blanklings"+ cntblns); 
		System.out.println("No.of cntedlns"+ cntedlns);
	}
}

