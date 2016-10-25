package com.msupply.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	
	
	@FindBy(xpath="//a[@class='rfnmenu '][contains(text(),'Sell')]")
	private WebElement sell;
	
	@FindBy(xpath="//a[@class='rfnmenu '][contains(text(),'Estimator')]")
	private WebElement Estimator;
	
	
	/*@FindBy(name="pwd")
	private WebElement pwTextBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
//	@FindBy(xpath="//span[contains(text(),'invalid']")
	@FindBy(xpath="//span[@class='errormsg']")
	private WebElement errMsg;
	*/
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickSell()
	{
		sell.click();
	}
	
	public void clickEstimator()
	{
		Estimator.click();
	}
	
/*
	public void setPassword(String pw)
	{
		pwTextBox.sendKeys(pw);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public void verifyErrMsgDisplayed()
	{
		Assert.assertTrue(errMsg.isDisplayed());
	}*/
}
