package ErrorMsgs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


// WAS on How to Verify Error messages in Selenium Webdriver:

//email to mukeshotwani@learn-automation.com

public class toVerifyErrormsgsbyAssert {
	@Test
	public void myTest() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		
		String actual_error=driver.findElement(By.id("errormsg_0_Email")).getAttribute("innerHTML");
		
		String expected_error="Please enter your email. ";
		
		//Type 1:
		Assert.assertEquals(actual_error, expected_error);
		
		//Type:2
		//Assert.assertTrue(actual_error.contains("bharathnice")); // Failure Case
		
		Assert.assertTrue(actual_error.contains("Please enter your email.")); //Pass case
		
		System.out.println("test is passed");
		
	}

}
