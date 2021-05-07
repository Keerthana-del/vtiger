package com.crm.vtiger.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrder {
	WebDriver driver;
	public PurchaseOrder(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
    private WebElement purchaseimg;
	
	public WebElement getPurchaseimg()
	{
		return purchaseimg;
	} 
	public CreateNewPurchaseOrder Purchaseorder()
	{
		purchaseimg.click();
		return new CreateNewPurchaseOrder(driver);
	}


}
