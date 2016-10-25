package framworokPOScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.test.library.BaseLib;
import com.test.library.GenericLib;
import com.test.po.LoginPO;

public class ValidLoginLogout extends BaseLib{
	
	LoginPO loginPo=null;
	
	@Test(priority=1,enabled=true)
	public void testValidLoginLogout()  // for Junit it is valid to give the "test" to the testValidLoginLogout for TestNG it is not required.
	{
	  try
		{
		  Assert.assertTrue(loginPo.getwpWelcomeLogo().isDisplayed(),"Welcome WP Logo is displayed");	
		  loginPo.getwpWelcomeLogo().click();
		}
			catch(AssertionError e)
			{
				throw e;
			}
		
		loginPo=new LoginPO(driver);
		
       //Inline COmmnets
		
		String xlPath="./TestData.xlsx";
		String un=GenericLib.getCellValue(xlPath,"TestData", 1, 0);
		String up=GenericLib.getCellValue(xlPath,"TestData", 1, 1);

		//enter valid un
//		l.setUserName("admin"); // Before the xl sheet created one statement.
		 loginPo.getUserName(un); // After Creation of the xl sheet and the Generics.class
		//enter valid pw
//		l.setPassword("manager"); // Before the xl sheet created one statement.
		loginPo.getUserPassword(up);
		//click login
		loginPo.clickLoginButton();
		//click logout
	}
		
}


