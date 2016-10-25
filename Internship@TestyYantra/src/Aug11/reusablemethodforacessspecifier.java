package Aug11;

class reusablemethodbyracessspecifier  {
	
	// we cannot create a method for Private Access Specifier and cannot be executed..
	
	public void Method1(int i){
		
		int q=i % 2; 
		System.out.println("modulus of " + q + " i.e, Inside the public void");
	}
	
	protected void Method3(int j){
		int w=j % 6;
		System.out.println("modulus of " + w + " i.e, Inside the protected void");
	}
	
	void Method4(int l){
		int e=l % 8;
		System.out.println("modulus of " + e  + " i.e, Inside the default void");
	}
}

// Businessclass:

	public class reusablemethodforacessspecifier { 
	public static void main(String[] args) {
		
		reusablemethodbyracessspecifier mforAS= new reusablemethodbyracessspecifier();
		
		mforAS.Method1(10);
		mforAS.Method3(30);
		mforAS.Method4(40);
		
	}
}