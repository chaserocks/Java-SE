package scripts;

import generics.Utility;
import library.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScripttoRunLibrary {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Library.login("rbk.2389@gmail.com","manager");
		Library.clickonrds(driver);
		Library.goToClientModule(driver);
		Library.createClient(driver, "HP");
		Library.goToInvoiceModule(driver);
		WebElement listbox = driver.findElement(By.xpath("//*[@id='client_id']"));
		Utility.searchListBox(listbox, "BP");
		Library.goToClientModule(driver);
		Library.deleteClient(driver, "BP");
		Library.logout(driver);
		driver.close();
	}
}


