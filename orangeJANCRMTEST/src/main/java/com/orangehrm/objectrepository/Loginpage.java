package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="txtUsername")
	private WebElement untbox;
	@FindBy(id="txtPassword")
	private WebElement pwdtbox;
	@FindBy(name="Submit")
	private WebElement login;
	
	public WebElement getUntbox() {
		return untbox;
	}

	public WebElement getPwdtbox() {
		return pwdtbox;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin(String un, String pwd)
	{
		getUntbox().sendKeys(un);
		getPwdtbox().sendKeys(pwd);
		getLogin().click();
		
		
		
	}
	
	

}
