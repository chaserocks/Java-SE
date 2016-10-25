package pom;

//POM class for HomePage:
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage {
	
		@FindBy(id="logoutLink")
		private WebElement logoutLink;
		
		@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
		private WebElement helpMenu;
		
		@FindBy(linkText="About actiTIME")
		private WebElement aboutActiTIME;
		
		@FindBy(id="aboutPopup")
		private WebElement aboutPopup;
		
		@FindBy(xpath="//img[@title='Close']")
		private WebElement closeButton;
			
		public EnterTimeTrackPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickLogout()
		{
			logoutLink.click();
		}
		
		public void clickHelpMenu()
		{
			helpMenu.click();
		}
		
		public void clickAboutActiTIME()
		{
			aboutActiTIME.click();
		}
		
		public void verifyPopupDisplayed()
		{
			Assert.assertTrue(aboutPopup.isDisplayed());
		}
		
		public void clickCloseButton()
		{
			closeButton.click();
		}
}
