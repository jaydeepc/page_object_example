package com.framework.config;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static final Properties prop = new Properties();

	public ReadProperties() {
		try{
			String cd = new File(".").getCanonicalPath();
			FileReader reader = new FileReader(cd + "/src/test/java/com/framework/config/appium.properties");
			prop.load(reader);
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		
	}
	
	public String getPlatformVersion(){
		return prop.getProperty("platformVersion");
	}

	public String getPlatformName(){
		return prop.getProperty("platformName");
	}

	public String getDeviceName(){
		return prop.getProperty("deviceName");
	}

	public String getServer(){
		return prop.getProperty("server");
	}

	public String getAppLocation(){
		return prop.getProperty("appLocation");
	}

}
