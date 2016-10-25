package PCLJava;

public class Extractnostring {
	public static void main(String[] args) {
		
		String msg="You are about to delete 3 tasks. Please confirm.";
	
		   String number= msg.replaceAll("[^0-9]", "");
	System.out.println(number);	   
		
		String str="sdfvsdf68fsdfsf8999ZLfsdf09";
	   String numberOnly= str.replaceAll("[^a-z]", "");
	   System.out.println(numberOnly);
		
		
		
	}

}
