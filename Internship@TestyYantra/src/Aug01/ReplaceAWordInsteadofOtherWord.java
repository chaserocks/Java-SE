package Aug01;


//9. Replace a string appium with india in I love India ?
import java.util.Scanner;
public class ReplaceAWordInsteadofOtherWord {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Word to be Replaced With any other Word");
	String str=sc.nextLine();
	
	System.out.println("Replaced Word With: " + str.replaceFirst("India", "Appium"));

  }
}
