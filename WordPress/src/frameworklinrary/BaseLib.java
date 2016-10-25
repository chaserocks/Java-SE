package frameworklinrary;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class BaseLib {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		try{
		if(GenericLib.getCongigValue(GenericLib.sConfigFile, "BROWSER").equalsIgnoreCase("Chrome"))
		{	
			System.setProperty("webdriver.chrome.driver",GenericLib.sDirPath+"\\resources\\chromedriver.exe");
			System.out.println("Chrome is set");
			driver = new ChromeDriver();
		}
		
		else if(GenericLib.getCongigValue(GenericLib.sConfigFile, "BROWSER").equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver",GenericLib.sDirPath+"\\resources\\IEDriverServer.exe");
			System.out.println("IE is set");
			driver = new InternetExplorerDriver();
		}
		
		else
		{
//			 System.setProperty("webdriver.firefox.marionette","E:\\Mystuff\\Chintu\\SOFTWARE TESTING STUFF\\2.Q-EDGE\\Selenium\\browsers\\geckodriver.exe");	   
			System.out.println("Firefox is set");
			System.setProperty("webdriver.firefox.marionette",GenericLib.sDirPath+"\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}		
		}
		
		catch(Exception e){
			System.out.println("Problem in launching driver");
			e.printStackTrace();
		}
		
		try
		{
			System.out.println(GenericLib.getCongigValue(GenericLib.sConfigFile, "URL"));
			String url = GenericLib.getCongigValue(GenericLib.sConfigFile, "URL");
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		}
		
		catch(AssertionError e)
		{
			throw e;
		}
	}
	
	/*@AfterMethod
	public void tearDown(){
		driver.quit();
	}*/

}
