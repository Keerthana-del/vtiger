package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add {
	@FindBy(xpath="//input[@name='btnAdd']")
	private WebElement add;
	public Add(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickAdd()
	{
		add.click();
	}
}
