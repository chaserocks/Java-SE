package scriptsbyusingparameters;

import org.testng.annotations.Test;

import pom.LoginPage;
import utility.Generics;

public class InvalidLogin extends BaseTestByParameters{
	@Test
	public void testInvalidLogin() throws InterruptedException
	{
		String xlPath="./Data/InValidLogin.xlsx"; // dont hardcode the file path.
		int rc=Generics.getRowCount(xlPath, "Sheet1");
	
		for(int i=1;i<=rc;i++)
		{
			String un=Generics.getCellValue(xlPath,"Sheet1", i, 0);
			String pw=Generics.getCellValue(xlPath,"Sheet1", i, 1);
		//enter invalid un
		LoginPage l=new LoginPage(driver);
//		l.setUserName("admin"); // Before the xl sheet created one statement.
		l.setUserName(un); // After Creation of the xl sheet and the Generics.class
		
		//enter invalid pwd
//		l.setPassword("manager"); // Before the xl sheet created one statement.
		l.setPassword(pw); // After Creation of the xl sheet and the Generics.class
		
		//click login
		l.clickLoginButton();
		//verify errMsg
		Thread.sleep(2000);
		l.verifyErrMsgDisplayed();
	}
   }
}
