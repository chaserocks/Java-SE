package generics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	
	public static boolean searchListBox(WebElement listbox,String ev) {
		System.out.println("Inside searchListBox");
		boolean found=false;
		System.out.println(found);
		
		Select s=new Select(listbox);
		List<WebElement> allOptions=s.getOptions();
		for(WebElement option:allOptions)
		{
		System.out.println("inside for");
				String av=option.getAttribute("innerHTML"); // innerHTML
				System.out.println(av);
				if(av.equals(ev))
				{
					System.out.println("inside if");
					found=true;
				}
	      }
	System.out.println("Out for"+found);
	return found;
	} //end of method				
		
}//endofclass


