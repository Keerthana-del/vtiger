package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
    WebDriver driver;
    Actions action;
	@FindBy(xpath="//b[.='Admin']")
	private WebElement admin;
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	private WebElement useradmin;
	@FindBy(xpath="//a[.='Users']")
	private WebElement user;
	public Admin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void mousehoweradmin(WebDriver driver) throws InterruptedException
	{	
		 action=new Actions(driver);
		action.moveToElement(admin).perform();
		Thread.sleep(3000);
		action.moveToElement(useradmin).perform();
		Thread.sleep(3000);
		user.click();
	}
}
