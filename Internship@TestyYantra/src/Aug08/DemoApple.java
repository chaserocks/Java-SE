package Aug08;

//Scenario: 6: example for covariant return type

class Apple{
	Apple get()
	{
		return this;
	}
}
class KashmirApple extends Apple{
	KashmirApple get()
	{
		return this;
	}
	void print()
	{
		System.out.println("Covariant return type DemoApple");
	}
}

class DemoApple{
	public static void main(String[] args)
	{
		KashmirApple kj1=new KashmirApple();
		kj1.print(); //object created by the reference variable of kj1, so o/p is Covariant return type DemoApple.
	}
}