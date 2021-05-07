package com.crm.vtiger.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericsUtils.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[.='More']")
	private WebElement moredrag;
    @FindBy(name="Purchase Order")
    private WebElement purchase;
    @FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
    private WebElement administratorimg;
    @FindBy(xpath="//a[.='Sign Out']")
    private WebElement signoutlink;
	public WebElement getMoredrag() {
		return moredrag;
	}
	public WebElement getPurchase() {
		return purchase;
	}
	public WebElement getAdministratorimg() {
		return administratorimg;
	}
	public WebElement getSignoutlink() {
		return signoutlink;
	}
    
	public void More()
	{
		mouseOver(driver,moredrag );
		purchase.click();
	}
	public void signout()
	{
		mouseOver(driver, administratorimg);
		signoutlink.click();
	}

	

}
