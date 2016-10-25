package scripts;

import org.testng.annotations.Test;

import pom.LoginPage;
import utility.Generics;

public class ValidLoginLogout extends BaseTest{
	

	@Test
	public void testValidLoginLogout()  // for Junit it is valid to give the "test" to the testValidLoginLogout for TestNG it is not required.
	{
       //Inline COmmnets
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
	}
		
}


