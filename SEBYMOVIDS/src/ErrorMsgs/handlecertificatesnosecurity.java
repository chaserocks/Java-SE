package ErrorMsgs;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

@Test
public class handlecertificatesnosecurity {
	public void handlecertificate() {
			
		//DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty("webdriver.chrome.driver","E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.cacert.org/");
			driver.findElement(By.linkText("Join")).click();
			
		
	}
	

}
