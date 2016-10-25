package scriptsbyusingparameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class BaseTestByParameters {
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondtions(XmlTest xmlTest) 
	{
	    String browser=xmlTest.getParameter("browser");
	    Reporter.log(browser,true);
	    if(browser.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","./Exes/chromedriver.exe");
			driver=new ChromeDriver();
	    }
	    else
	    {
	    	driver=new FirefoxDriver();
	    }
		driver.get("http://localhost:8080/"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Impicitwait is done ByFindElements only u can write here.
	}
	
	@AfterMethod
	public void postCondition(ITestResult result)
	{
		int t = result.getStatus();
		System.out.println(t);
		
		if(result.getStatus()==1)
		{
			EventFiringWebDriver e=new EventFiringWebDriver(driver);
			File srcFile=e.getScreenshotAs(OutputType.FILE);
			File destFile=new File("./screenshots/abc.png");
		try{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(IOException e1)
		{
			
		}
		}
		else
		{
		System.out.println("hi");	
		}
		
		driver.close();
	}
  }
