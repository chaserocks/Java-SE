package scriptsbyusingparameters;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;
import utility.Generics;

public class VerifyAboutPopup extends BaseTestByParameters{
	
	@Test
	public void testVerifyAboutPopup() throws InterruptedException
	{
		String xlPath="./Data/ValidLoginLogout.xlsx";
		String un=Generics.getCellValue(xlPath,"Sheet1", 1, 0);
		String pw=Generics.getCellValue(xlPath,"Sheet1", 1, 1);
		//enter valid un
		LoginPage l=new LoginPage(driver);
//		l.setUserName("admin"); // Before the xl sheet created one statement.
		l.setUserName(un); // After Creation of the xl sheet and the Generics.class
		//enter valid pw
//		l.setPassword("manager"); // Before the xl sheet created one statement.
		l.setPassword(pw);
		//click login
		l.clickLoginButton();
		//click logout
		
		//click on Help
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickHelpMenu();
		
		//click about Actitime
		e.clickAboutActiTIME();
		
		//verify popup
		e.verifyPopupDisplayed();
		Thread.sleep(4000);
		
		//click on close
		e.clickCloseButton();
		
		//click on logout
		e.clickLogout();
	}
}
