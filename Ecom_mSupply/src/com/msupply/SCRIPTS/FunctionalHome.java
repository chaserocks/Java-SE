package com.msupply.SCRIPTS;

import org.testng.annotations.Test;
import com.msupply.POM.HomePage;

public class FunctionalHome extends BaseTest {
	
	@Test
	public void testHomePage() {
		
		HomePage hm=new HomePage(driver);
		
//		hm.clickSell();
		
		hm.clickEstimator();
		/*try{
			Thread.sleep(3000);
			}
			catch(Exception e)
			{
				hm.clickEstimator();
			}
			
//		
		try{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			hm.clickSell();
		}
*/		
	}

}
