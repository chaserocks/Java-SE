package Aug11;

// Write a program to convert string to int, int to string, string to double using variables.

public class StringtointandDouble {
	public static void main(String[] args) {
	
	String str="12345";
	
	// Conversion from String to integer : 
		
		int sint=Integer.parseInt(str);
		System.out.println(sint);
		
//		Conversion from integer to String :
		
		int num=12345;
		
		String ints=Integer.toString(num);
		System.out.println(ints);
		
   //  Conversion from String to double :
		
		String strdb="23.23";
		double sdble =Double.parseDouble(strdb);
		System.out.println(sdble);
		
	}

}
