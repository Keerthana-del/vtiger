package com.orangehrm.generics;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Filelib {
	public String getPropertyValue(String key) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data/Commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}

}
