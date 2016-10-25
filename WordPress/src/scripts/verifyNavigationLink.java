package scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pom.ChaseWordPress;

public class verifyNavigationLink extends ValidLoginLogout {
	
	@Test
	public void testNavigation()
	{
	ChaseWordPress c=new ChaseWordPress(driver);
	
	//click on the Help Menu:
	c.clickHelp();
	
	try{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{  }
	
	// click on the Navigation Link in the Help Menu.
	c.clickNavigationLink();
	
  }
	
	// Click on the LogoutLink:
	
	@Test(priority=1)
	public void clickLogoutLink()
	{
		ChaseWordPress c=new ChaseWordPress(driver);
		try{
			Thread.sleep(3000);
			}
		catch(Exception e)
		{ }	
		WebElement logout=driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a"));
		Actions actions=new Actions(driver);
		actions.moveToElement(logout).perform();
		
		try{
			Thread.sleep(1000);
			}
		catch(Exception e)
		{ }
		
		// click Logout:
		c.clickLogoutLink();
	}
}
