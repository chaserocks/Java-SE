package com.mSupply.Scripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
		
		public WebDriver driver;
		
		@BeforeMethod
		public void preCondtions()
		{
		    driver=new FirefoxDriver();
			driver.get("http://localhost:8080/login.do");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Impicitwait is done ByFindElements only u can write here.
			
		}
		
		@AfterMethod
		public void postCondition()
		{
			driver.close();
		}
	}


