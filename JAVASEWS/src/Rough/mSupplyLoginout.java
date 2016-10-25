package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mSupplyLoginout {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
	    driver=new FirefoxDriver();
		driver.get("https://www.msupply.com/");
		System.out.println("Application title is ============="+driver.getTitle());
	   // driver.get("http://localhost:8080/login.do");
		Thread.sleep(4000);

//		driver.findElement(By.xpath("//a[@class='rfnmenu '][contains(text(),'Sell')]")).click();	
//		driver.findElement(By.xpath("html/body/div[3]/div[2]/div[1]/div/div[3]/div/div[3]")).click();
		
		driver.findElement(By.xpath("//a[@class='rfnmenu '][contains(text(),'Estimator')]")).click();
//		System.out.println(driver.findElement(By.cssSelector("li[id='lnkAccount']>a>span")).getText());
		
		Thread.sleep(6000);
		
		driver.close();	
	}
	}

