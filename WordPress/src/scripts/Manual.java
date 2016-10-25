package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Manual {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys("rbk.2389@gmail.com");
		driver.findElement(By.id("user_pass")).sendKeys("manager");
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
		
		WebElement logout=driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']/a"));
		Actions actions=new Actions(driver);
		actions.moveToElement(logout).perform();
		//driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='wp-admin-bar-logout']/a")).click();
   //	driver.findElement(By.id("wp-admin-bar-logout")).click();
		//driver.close();
	}

}
