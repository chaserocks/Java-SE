package PCLJava;

public class Find2AinaName {
	public static void main(String[] args) {
		String str="ASHOKA";
		
		int i=0;
		int pos=0;
		
		while(str.indexOf('A',i)!=-1)
		{
			pos=str.indexOf('A',i)+1;
			System.out.println("A is at "+ pos  + " position");
			i=pos;
		}
		
		
	}

}
;