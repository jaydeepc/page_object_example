package com.framework.tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.config.ReadProperties;

public class BaseTest{

	static String platformVersion = new ReadProperties().getPlatformVersion();
	static String platformName = new ReadProperties().getPlatformName();
	static String deviceName = new ReadProperties().getDeviceName();
	static String server = new ReadProperties().getServer();
	static String appLocation = new ReadProperties().getAppLocation();

	public WebDriver driver;

	@Before
	public void setUp() throws MalformedURLException{
		File app = new File(appLocation);
		DesiredCapabilities capabilities = new DesiredCapabilities();	
	    capabilities.setCapability("platformVersion", platformVersion);
	    capabilities.setCapability("platformName", platformName);
	    capabilities.setCapability("deviceName", deviceName);	
		capabilities.setCapability("app", app.getAbsolutePath());
	
	    driver = new RemoteWebDriver(new URL(server),
	            capabilities);

	}

    	
}
