package InterviewQsandAs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//WAP to that proves Strings are immutable?
// Ans:Though there is no way to find if Strings are immutable through coding, but the coding below is an attempt to show if Strings are mutable.
// Remember the only way to say if Strings are immutable is to see the API.
public class StringsareImmutable {
	public static void main(String[] args) {
		String initial="ABCDEF";
		String after=initial.replace('A','Z');
		System.out.println("Initial:"+initial);
		System.out.println("After:"+after);
		
	
	}

}
