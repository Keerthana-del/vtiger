package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Userdetails {
	
	
	@FindBy(xpath="//select[@id='systemUser_userType']")
	private WebElement userrole;
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement employeename;
	@FindBy(xpath="//input[@id='systemUser_userName']")
    private WebElement username;
    @FindBy(xpath="//select[@id='systemUser_status']")
    private WebElement status;
    @FindBy(xpath="//input[@id='systemUser_password']")
    private WebElement pasward;
    @FindBy(xpath="//input[@id='systemUser_confirmPassword']")
    private WebElement conpasward;
    @FindBy(id="btnSave")
    private WebElement save;
    public Userdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    public void seleceeet()
    {
    	Select select=new Select(userrole);
    	select.selectByIndex(0);
    }
    public void Employee(String un)
	{
    	employeename.sendKeys(un);
	}
    public void Username(String nu)
  	{
       	username.sendKeys(nu);
   	} 
    public void select()
    {
    	Select select=new Select(status);
    	select.selectByIndex(0);
    }
    public void Passward(String jh)
   	{
    	pasward.sendKeys(jh);
   	} 
    public void Confirm(String hj)
   	{
    	conpasward.sendKeys(hj);
   	} 
   public void savebutton()
   {
    	save.click();
   }
    
}
