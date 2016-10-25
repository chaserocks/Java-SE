package scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot {
	
	WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new FirefoxDriver();
		driver.get("https://localhost/bambooinvoice/");  // use the "news.google.com"
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postCondition(ITestResult res) throws IOException
	{
		System.out.println(res.getStatus());
		if(res.getStatus()==2)
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			String df = sdf.format(new Date());
	
			//Take ScreenShot:
			EventFiringWebDriver e=new EventFiringWebDriver(driver);
			File srcFile=e.getScreenshotAs(OutputType.FILE);
			File destFile=new File("./Screenshots/"+df+".png"); // "./" is for the current folder.
			FileUtils.copyFile(srcFile, destFile);
	 }
		driver.close();
	}
	@Test(priority=1)
	public void validLoginLogout()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
	}
	
	@Test(priority=2)
	public void invalidLogin()
	{
		driver.findElement(By.name("pwd")).sendKeys("admin");
		Assert.fail();
	}
	@Test(priority=3)
	public void VerifyAbtErr()
	{
		driver.findElement(By.id("login")).click();
	}
	
}
