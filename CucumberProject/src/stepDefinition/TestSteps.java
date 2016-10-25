package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	static FirefoxDriver driver=null;
	@Given("^User launches the browser and navigates to the url$")
	public void user_launches_the_browser_and_navigates_to_the_url() throws Throwable {
	   driver=new FirefoxDriver();
	   driver.get("http://localhost/orangehrm_mysql/symfony/web/index.php/auth/login");
	   
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("manager");
	    
	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^welocome msg should come on the screen$")
	public void welocome_msg_should_come_on_the_screen() throws Throwable {
	   String actmsg=driver.findElement(By.xpath("//*[@id='welcome']")).getText();
	   String expmsg="Welcome Admin";
	   Assert.assertEquals(actmsg, expmsg);
	}
	
	
	@When("^the user clicks on logout$")
	public void the_user_clicks_on_logout() throws Throwable {
	    driver.findElement(By.xpath("//*[@id='welcome']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(2000);
	}

	@Then("^he shoul come to the login page$")
	public void he_shoul_come_to_the_login_page() throws Throwable {
	    String expurl="http://localhost/orangehrm_mysql/symfony/web/index.php/auth/login";
	    String acturl=driver.getCurrentUrl();
	    Assert.assertEquals(acturl, expurl);
	}
}
