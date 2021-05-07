package com.crm.vtiger.purshase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericsUtils.BaseClass;
import com.crm.vtiger.GenericsUtils.JavaUtility;
import com.crm.vtiger.GenericsUtils.WebDriverUtility;

public class TC_13_createPurchaseOrderWithItemWithoutEnteringListprice extends BaseClass {
	WebDriverUtility wUtil=new WebDriverUtility();
	@Test
	public void createPurchaseOrderWithItemWithoutEnteringListprice() throws InterruptedException{
		
		//Navigate to purchase
		WebElement element = driver.findElement(By.xpath("//a[.='More']"));
		wUtil.mouseOver(driver, element);	
		driver.findElement(By.xpath("//a[.='Purchase Order']")).click();
		
		//Create purchase with item 
		driver.findElement(By.xpath("//img[@title='Create Purchase Order...']")).click();
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("jaan");
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();

		wUtil.switchToWindow(driver,"Vendors" );
		driver.findElement(By.xpath("//a[.='KERTHAN']")).click();
		wUtil.switchToWindow(driver, "PurchaseOrder");
		
		//Add billing address
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("vijaynagar"+JavaUtility.geRandomData());
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("vijaynagar"+JavaUtility.geRandomData());
		
		//Add product
		driver.findElement(By.xpath("//img[@title='Products']")).click();
		wUtil.switchToWindow(driver, "Products");
		driver.findElement(By.xpath("//a[.='BURGER']")).click();
		wUtil.switchToWindow(driver, "PurchaseOrder");
		driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("23");
		
		//save
	    driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
				
	}

}
