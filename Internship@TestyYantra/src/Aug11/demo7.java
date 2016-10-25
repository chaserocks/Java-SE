package Aug11;

	class MummyMD{
		void CreateMD(){
		System.out.println("Heat Tava");
		System.out.println("put 1 table spoon oil and spread the dosa batter");
		System.out.println("After a while put a bit of oil at the edge and centre");
		System.out.println("once golden color , put  potato masala");
		System.out.println("Fold both ends and place on a plate");
		}
		void CreateIdly()
		{
			System.out.println("white Idly");
		}
	}

	class MyMD extends MummyMD{
		void CreateMD()
		{
			super.CreateMD();
			System.out.println("Put the ghee on Dosa");
			System.out.println("put chutney in a cup");
		}
		void CreateIdly()
		{
			super.CreateIdly();
			System.out.println("prepare masala idly");
		}
		void mixedIdly()
		{
			super.CreateIdly();
			//this.CreateMD();// understand sake.
			System.out.println("put this on left half of the plate"); // white idly
			this.CreateIdly();
			System.out.println("put this on right half of the plate");// masala Idly
		}
	}
	public class demo7 {	
	
		public static void main(String[] args){
			MyMD m1=new MyMD();
			m1.CreateMD();
			System.out.println("-------------------");
			m1.CreateIdly(); //masala Idly
			System.out.println("----------next week-------------");
			m1.mixedIdly();// mi
			
		}
	}

