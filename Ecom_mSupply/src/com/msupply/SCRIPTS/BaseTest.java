package com.msupply.SCRIPTS;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
		
		public WebDriver driver; // if it is public u can use anywhere(in all webpages) 
		
		@BeforeMethod
		public void preCondtions()
		{
			
//			System.setProperty("webdriver.gecko.driver","./exes/geckodriver.exe");
		    driver=new FirefoxDriver();
			driver.get("https://www.msupply.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Impicitwait is done ByFindElements only u can write here.
			
		}
		
		/*@AfterMethod
		public void postCondition()
		{
			driver.close();
		}*/
	}


