package Aug11;

class O {
	
}
class P extends O
{
		int i, j;
		P()
		{
			this(100,200);
			//super();// we cannot have this & super class constructor together.
		}
		private P(int i,int j)
		{
			super();// automatically put by the compiler.
			this.i=i;
			this.j=j;
		}
		
		void disp()
		{
			this.print();
		}
		void print()
		{
			System.out.println("print() method");
		}
}

class Demo8
{
	static public void main(String[] args)
	{
		P p1=new P();
		System.out.println("i="+p1.i+ "j="+ p1.j);
		p1.disp();
	}
}

