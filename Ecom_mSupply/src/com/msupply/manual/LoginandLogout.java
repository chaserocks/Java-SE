package com.msupply.manual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginandLogout {
	
	 public static void main(String[] args) throws InterruptedException  {
		 /*System.setProperty("webdriver.gecko.driver","E:\\Mystuff\\Chintu\\SOFTWARE TESTING STUFF\\2.Q-EDGE\\Selenium\\browsers\\geckodriver.exe"); 
		// System.setProperty("webdriver.firefox.marionette","E:\\Mystuff\\Chintu\\SOFTWARE TESTING STUFF\\2.Q-EDGE\\Selenium\\browsers\\geckodriver.exe");*/
			
			
//			System.setProperty("webdriver.gecko.driver","E:\\Mystuff\\SELINUMWS\\Ecom_mSupply\\exes\\geckodriver.exe");
			WebDriver driver=null;
					
					//new FirefoxDriver();
		    driver=new FirefoxDriver();
			driver.get("https://www.msupply.com/");
			System.out.println("Application title is ============="+driver.getTitle());
		   // driver.get("http://localhost:8080/login.do");
			Thread.sleep(4000);
		
			driver.findElement(By.xpath("//a[@class='rfnmenu '][contains(text(),'Sell')]")).click();	
//			System.out.println(driver.findElement(By.cssSelector("li[id='lnkAccount']>a>span")).getText());
			
			Thread.sleep(6000);
			
			driver.close();	
		}
	}


