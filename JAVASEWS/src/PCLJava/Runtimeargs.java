package PCLJava;

public class Runtimeargs {

	// for pass the values in the runtime u have to go Run: Run Configuration and select the java file(Runtimeargs) click on Argument tab and pass the value
	public static void main(String[] args) {
			
		for(int i=0;i<args.length;i++)
          
			System.out.println(args[i]);
		System.out.println("---------------");
		
		for(String s: args)
			System.out.println(s);
	}
}

