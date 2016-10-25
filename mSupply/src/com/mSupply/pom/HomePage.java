package com.mSupply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	
	
	@FindBy(xpath="html/x:body/x:div[3]/x:div[2]/x:div[1]/x:div/x:div[3]/x:div/x:div[3]/x:h5/x:a")
	private WebElement sell;
	
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
