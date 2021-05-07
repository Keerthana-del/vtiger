package com.crm.vtiger.purshase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.annotations.Test;

import com.crm.vtiger.GenericsUtils.BaseClass;
import com.crm.vtiger.GenericsUtils.FileUtility;
import com.crm.vtiger.GenericsUtils.JavaUtility;
import com.crm.vtiger.GenericsUtils.WebDriverUtility;
import com.crm.vtiger.pomclass.CreateNewPurchaseOrder;


public class TC_11_createPurshaseWithDownwardSymbol extends BaseClass
{
	
	//@Test(groups = "regressionTest")
	public void createPurchaseWithDownwardSymbol() throws Throwable{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Navigate to purchase
		WebElement element = driver.findElement(By.xpath("//a[.='More']"));
		wUtil.mouseOver(driver, element);	
		driver.findElement(By.xpath("//a[.='Purchase Order']")).click();
		
		//Create purchase with item and click on downward
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
		driver.findElement(By.xpath("//input[@name='Button']")).click();
	
		//click on downward
		driver.findElement(By.xpath("//a[@title='Move Downward']")).click();
		driver.findElement(By.xpath("//img[@title='Products']")).click();
		wUtil.switchToWindow(driver, "Products");
		driver.findElement(By.xpath("//a[.='CHICKEN BIRIYANI']")).click();
		wUtil.switchToWindow(driver, "PurchaseOrder");
		driver.findElement(By.xpath("//input[@name='qty1']")).sendKeys("3");
		

		
		//save
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
        
		@Test
		public void createPurchaseWithDownwardSymbol()
		{
			CreateNewPurchaseOrder cr=new CreateNewPurchaseOrder();
			cr.createPurchaseOrderimg();
			wUtil.switchToWindow(driver,"Vendors" );
			cr.purchaseOrderlink();
			wUtil.switchToWindow(driver, "PurchaseOrder");
			cr.addresss();
			wUtil.switchToWindow(driver,"Products" );
			cr.productLink();
			wUtil.switchToWindow(driver, "PurchaseOrder");
            cr.addProduct();
			wUtil.switchToWindow(driver,"Products" );
			cr.productLink1();
			wUtil.switchToWindow(driver, "PurchaseOrder");
			cr.quantitytf();
			cr.savebutton();

            
			
		}
	}
}
