package com.crm.vtiger.GenericsUtils;

import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;
/*
 * 
 * this class contains java specific generic libraries
 * @keerthana(doubt clarification if any question occured regarding cde
 */
public class JavaUtility {
	/*
	 * generic random number
	 * @keerthana
	 */
	@Test
public static String geRandomData()
{
	Random random=new Random();
	int ran=random.nextInt(1000);
	return ""+ran;
}
	/*
	 * Generate current system date
	 * @keerthana
	 */
	public String getCurrentSystemDate()
	{
		Date date=new Date();
		String currentDate=date.toString();
		return currentDate;
	}

 
}

