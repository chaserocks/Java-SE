package PCLJava;

import java.util.Scanner;

//write a method to verify a password. Password is 8 character length,has CAP alpha,a no and a spl charachter.

public class CAP {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter password");
		String pswd = input.next();
		String str="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,10}"; 
	}

}
