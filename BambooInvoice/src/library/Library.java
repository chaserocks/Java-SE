package library;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Library {

	public static WebDriver login(String un,String pw) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/bambooinvoice/index.php/login");
		driver.findElement(By.id("username")).sendKeys("rbk.2389@gmail.com");
		driver.findElement(By.id("password")).sendKeys("manager");
		driver.findElement(By.id("login")).click();
		return driver; // return is not possible when the method has void so change it to WebDriver
	}
	

	public static void clickonrds(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.className("root_invoices")).click();
		String xp="//input[@type='radio']";
		List<WebElement> allradiobtns=driver.findElements(By.xpath(xp));
		
		 for(WebElement allrbs : allradiobtns)
		 {
			 Thread.sleep(150);
			 allrbs.click();
			 if(allrbs.isSelected())
			 {
				 System.out.println("pass");
			 }
			 else
			 {
				 System.out.println("fail");
			 }
		 }
	}
	
	public static void createClient(WebDriver driver,String cn)
	{
		driver.findElement(By.linkText("Create New Client")).click();
		driver.findElement(By.id("clientName")).sendKeys(cn);
		driver.findElement(By.id("website")).sendKeys("www.hp.com");
		driver.findElement(By.id("address1")).sendKeys("naimnagar");
		driver.findElement(By.id("address2")).sendKeys("Hanamkonda");
		driver.findElement(By.id("city")).sendKeys("Warangal");
		driver.findElement(By.id("province")).sendKeys("Telangana");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("postal_code")).sendKeys("506009");
		driver.findElement(By.id("tax_code")).sendKeys("123456789");
		driver.findElement(By.id("notax")).click();
		driver.findElement(By.id("createClient")).click();
		
	}

	public static boolean searchListBox(WebElement listBox,String ev)
	{
		boolean found=false;
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option:allOptions)
		{
			String av=option.getText();
			if(av.equals(ev))
			{
				found=true;
			}
		}
		return found;
	}
	
	
	public static void goToInvoiceModule(WebDriver driver)
	{
		driver.findElement(By.linkText("Root System")).click();
		driver.findElement(By.linkText("Invoices")).click();
	}
	
	public static void goToClientModule(WebDriver driver)
	{
		driver.findElement(By.linkText("Root System")).click();
		driver.findElement(By.className("root_clients")).click();
	}
	
	public static void deleteClient(WebDriver driver,String cn)
	{
//		driver.findElement(By.linkText("Clients")).click();
		
		driver.findElement(By.linkText(cn)).click();
		
		String xp="//a[text()='"+cn+"']/../following-sibling::div[1]//a[text()='Delete Client']";
		driver.findElement(By.xpath(xp)).click();
	
		//driver.findElement(By.linkText("Delete Client")).click();
		driver.findElement(By.linkText("Delete client and all invoices")).click();
	}
	
	
	public static void logout(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
	}
	



}
