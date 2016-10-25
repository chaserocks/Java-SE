package scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.xml.XmlTest;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

public class BaseTest { // public

	public WebDriver driver; // if it is public u can use anywhere(in all webpages)  
	
//	@BeforeMethod
	
	@BeforeClass
	public void preConditions(XmlTest xmlTest) throws MalformedURLException
	{
//		driver=new FirefoxDriver();
//		desiredcapabailities:which browser should open in the remote computer
//		driver=new RemoteWebDriver(DesiredCapabilities.firefox());
		String browser=xmlTest.getParameter("browser");
		String url=xmlTest.getParameter("url");
		URL remoteAddress=new URL(url);
		Reporter.log(browser,true);
		
		if(browser.equals("chrome"))
		{
			driver=new RemoteWebDriver(remoteAddress, DesiredCapabilities.chrome());
		}
		
		/*else
		{
			driver=new RemoteWebDriver(remoteAddress, DesiredCapabilities.firefox());
		}*/
		else
			
		{
			driver=new RemoteWebDriver(remoteAddress, DesiredCapabilities.internetExplorer());
		}
		
		driver.get("https://localhost/wordpress/wp-login.php");
//		javas
//		driver.navigate("javascript:document.getElementById('overridelink').click()");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void postCondition()
	{
		driver.close();   // driver should be globally declared or class variables.
	}
	
}
