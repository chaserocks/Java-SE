package General;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disablechromenotifications {


		public static void main(String[] args) throws Exception {
			
			//Set the chrome path
			System.setProperty("webdriver.chrome.driver", "E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");

			
	                // Create object of HashMap Class
			Map<String, Object> prefs = new HashMap<String, Object>();
	              
	                // Set the notification setting it will override the default setting
			prefs.put("profile.default_content_setting_values.notifications", 2);

	                // Create object of ChromeOption class
			ChromeOptions options = new ChromeOptions();

	                // Set the experimental option
			options.setExperimentalOption("prefs", prefs);

	                // pass the options object in Chrome driver

			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("rbk.2389@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("capricornsnice235");
			driver.findElement(By.id("loginbutton")).click();		
		}
	  
}

