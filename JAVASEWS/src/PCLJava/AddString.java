package PCLJava;

public class AddString {
	
	
	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++) // args store/contains the StringArray values when u pass the values. 
			sum=sum+Integer.parseInt(args[i]);
		System.out.println(sum); // pass the values in Arguments section in Run Menu.
		
		System.out.println("--------------");
		
		for(String s:args) //this shows the values what u have passed in the args.
			System.out.println(s); 
			
	}
	

}
