package Aug11;
//5) Write a program with reusable method to sum 2 numbers in a class, create a sub class and override the method, overload the method as well.
 
  class OROL {
	
	public  void sum(int a,int b) {
		int c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("sum is "+ c  +" "+ "method of OROL class");
	}
 }
	class B extends OROL {
		public  void sum(int a,int b) {

			int c;
			a=10;
			b=20;
			c=a+b;
			System.out.println("sum is "+ c  +" "+ "method of B class");
		}
	}
	
	class C extends OROL {
		public  void sum(int a,int b,int c) {

			int d;
			a=10;
			b=20;
			c=30;
			d=a+b+c;
			System.out.println("sum is "+ d  +" "+ "method of C class");
		}
	}			
	public  class sum2numberwithsubclassOROL  {
	
	public static void main(String[] args) {
		
		OROL a = new OROL();
		B b = new B();
		C c=new C();
		a.sum(10, 20); // Here Method over riding is done of ORAL Class.
		b.sum(20, 30); // Here Method over riding is done of B Class.
		c.sum(10, 20, 30); //Here Method over loading is done of C Class.
	
	}
  }
	


