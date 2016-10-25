package Genearal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleDeveloperOptions {
	public static void main(String[] args) {
		
	//Set the chrome path
	System.setProperty("webdriver.chrome.driver", "E:\\Mystuff\\SELINUMWS\\BrowserDrivers\\chromedriver.exe");

	// Create object of ChromeOptions class
	ChromeOptions options = new ChromeOptions();

	// add parameter which will disable the extension
	options.addArguments("--disable-extensions");

	// Start the chrome session
	WebDriver driver = new ChromeDriver(options);

}
}