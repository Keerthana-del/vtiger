package com.orangehrm.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.generics.Baseclass;
import com.orangehrm.objectrepository.Add;
import com.orangehrm.objectrepository.Admin;
import com.orangehrm.objectrepository.Logoutpage;
import com.orangehrm.objectrepository.Userdetails;


//@Listeners(com.orangehrm.generics.Listenerimplementation.class)
public class Testclass1 extends Baseclass {
	@Test
	public void User() throws InterruptedException, IOException
	{
	//	Assert.fail();
		Admin a=new Admin(driver);
		a.mousehoweradmin(driver);
		
		Thread.sleep(2000);
		
		Add add=new Add(driver);
	    add.clickAdd();
	    
	    Userdetails u=new Userdetails(driver);
	   u.seleceeet();
	   Thread.sleep(1000);
	    u.Employee("Aaliyah Haq");
	   Thread.sleep(1000);
	    u.Username("Kirtana");
	   Thread.sleep(1000);
	    u.select();
	    Thread.sleep(1000);
	    u.Passward("login123");
	   u.Confirm("login123");
	   Thread.sleep(2000);
	   u.savebutton();
	   Thread.sleep(4000);
	   driver.close();
	   
	   Logoutpage lo1=new Logoutpage(driver);
	   String text=lo1.getUsernameText();
	   Assert.assertEquals(text,f.getPropertyValue("EU"));
	}
	

}
