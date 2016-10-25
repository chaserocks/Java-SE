package framworokPOScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPO {
	
		WebDriver driver = null;
		
		public LoginPO(WebDriver driver)
		{
//			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(css="a[title='Powered by WordPress']")
		private WebElement wpWelcomeLogo;
		public WebElement getwpWelcomeLogo(){
			return wpWelcomeLogo;
		}
		
		@FindBy(css="input[id='user_login']")
		private WebElement userName;
		public WebElement getUserName(String un){
			userName.sendKeys(un);
			return userName;
		}
	
		@FindBy(css="input[id='user_pass']")
		private WebElement userPassword;
		public WebElement getUserPassword(String up){
			userPassword.sendKeys(up);
			return userPassword;
		}
		
		private WebElement passClear;
		public WebElement getClear()
		{
			userPassword.clear();
			return passClear;
		}
	
	
		@FindBy(id="wp-submit")
		private WebElement logIn;
		public WebElement clickLoginButton()
		{
			logIn.click();
			return logIn;
		}
	
		@FindBy(id="login_error")
		private WebElement logInErr;
		public WebElement verifyErrMsg()
		{
			Assert.assertTrue(logInErr.isDisplayed());
			return logInErr;
		}


}
