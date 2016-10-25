package framworokPOScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePO 
{

	
	
	WebDriver driver = null;
	public HomePO(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(id="contextual-help-link")
	private WebElement helpMenu;
	public void clickHelp()
	{
		helpMenu.click();
	}
	
	
	@FindBy(xpath="//*[@id='tab-link-help-navigation']/a")
	private WebElement navigationLink;
	public void clickNavigationLink()
	{
		navigationLink.click();
	}

	@FindBy(linkText="Log Out")
	private WebElement logoutLink;
	public void clickLogoutLink()
	{
		logoutLink.click();
	}	

}