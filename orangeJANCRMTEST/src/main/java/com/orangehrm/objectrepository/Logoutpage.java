package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	
	@FindBy(xpath="//a[text()='Kirtana']")
	private WebElement usn;
	@FindBy (id="welcome")
	private WebElement welcome;
@FindBy(xpath="//li//a[.='Logout']")
private WebElement logout;


public Logoutpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String getUsernameText()
{
	return usn.getText();
}

public void logout()
{
	welcome.click();
	logout.click();
}

}
