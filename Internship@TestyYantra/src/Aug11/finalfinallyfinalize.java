package Aug11;

//final: It is a keyword, it can assign to the varibale, method and class but not to the constructor, Once a value is assigned you cannot change it. When ever u declare the final variable it should be initialised in the same line in global scope and in local scope it can be done in same line or later. 

public class finalfinallyfinalize {
	
	final static int i=10; // static final
	final int j=100; // non-static final
	
	public static void main(String[] args) {
		
		// one way of printing the value :
		
		System.out.println("i = " +finalfinallyfinalize.i); // output : 10
		
	//	finalfinallyfinalize.i=12; // cannot re intialialise becaze of final variable already declared.
		
		// another way of printing the value :
		
		finalfinallyfinalize fff=new finalfinallyfinalize();
		System.out.println("j = " +fff.j); // output : 100
	}
}
