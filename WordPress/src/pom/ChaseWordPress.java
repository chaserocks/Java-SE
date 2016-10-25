package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// all are by private . job is to create the pom classes and script(TestNg) classes.
public class ChaseWordPress { // For every Page declaration,Intialisation & Utiliations should be done in the pom package. Page should be same as Title of that Page.

	
	@FindBy(id="contextual-help-link")
	private WebElement helpMenu;
	
	@FindBy(xpath="//*[@id='tab-link-help-navigation']/a")
	private WebElement navigationLink;
	
	@FindBy(linkText="Log Out")
	private WebElement logoutLink;
	
	public ChaseWordPress(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickHelp()
	{
		helpMenu.click();
	}
	
	public void clickNavigationLink()
	{
		navigationLink.click();
	}

	public void clickLogoutLink()
	{
		logoutLink.click();
	}
}