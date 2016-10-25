package Rough;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.firefox.FirefoxDriver;

// To select the check boxes in the flipkart:

public class flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/womens-footwear/flats/pr?otracker=nmenu_sub_Women_0_Flats&p[]=facets.brand%255B%255D%3DBata&p[]=facets.brand%255B%255D%3DCatwalk&p[]=facets.brand%255B%255D%3DMetro&sid=osp%2Fiko%2F9d5");
		String xp="//div[text()='Brand']/../..//input[@type='checkbox']/../div[1]";
		List<WebElement> a = driver.findElements(By.xpath(xp));
		int count=a.size();
		System.out.println(count);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(WebElement b:a)
		{
			js.executeScript("arguments[0].click()",b);
			Thread.sleep(2000);
		}


   }
}
		
	

