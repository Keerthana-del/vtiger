package com.crm.vtiger.GenericsUtils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListingClass implements ITestListener{
	public void onTestFaiture(ITestResult result){
		String failedTestName=result.getMethod().getMethodName();
		
	}

}
