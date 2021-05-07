package com.crm.vtiger.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * @keerthana
 * 
 * 
 */
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement usernametf;
	@FindBy(name="user_password")
	private WebElement passwordtf;
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	public WebElement getUsernametf() {
		return usernametf;
	}
	public WebElement getPasswordtf() {
		return passwordtf;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public HomePage Logindetails(String username,String password )
	{
		usernametf.sendKeys("username");
		passwordtf.sendKeys("password");
		loginbtn.click();
		return new HomePage(driver);
	}
	
}
