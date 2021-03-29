package com.orangehrm.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangehrm.objectrepository.Loginpage;
import com.orangehrm.objectrepository.Logoutpage;

public class Baseclass {
	static
	{
		System.setProperty("webdriver.gecko.driver","./src/main/resources/driver/geckodriver.exe");
	}
	public static WebDriver driver;
	public Filelib f=new Filelib();
	public WebDriverCommonLib w=new WebDriverCommonLib();
	@BeforeTest
	public void operBrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		w.waitForElementInGui(driver);
	}
@AfterTest
public void closeBrowser() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}
@BeforeMethod
public void login() throws IOException
{
	String un=f.getPropertyValue("UN");
	String pw=f.getPropertyValue("PWD");
	driver.get(f.getPropertyValue("URL"));
	Loginpage l=new Loginpage(driver);
	l.clickLogin(un,pw);
}
@AfterMethod
public void logout() throws InterruptedException
{
	Logoutpage lo=new Logoutpage(driver);
	Thread.sleep(2000);
	lo.logout();
}



}
