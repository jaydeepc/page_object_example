package com.framework.pages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.config.ReadProperties;

public class AbstractPage {

	static String platformVersion = new ReadProperties().getPlatformVersion();
	static String platformName = new ReadProperties().getPlatformName();
	static String deviceName = new ReadProperties().getDeviceName();
	static String server = new ReadProperties().getServer();
	static String appLocation = new ReadProperties().getAppLocation();

	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public HomePage navigateToApp() throws MalformedURLException{
		File app = new File(appLocation);
		DesiredCapabilities capabilities = new DesiredCapabilities();	
	    capabilities.setCapability("platformVersion", platformVersion);
	    capabilities.setCapability("platformName", platformName);
	    capabilities.setCapability("deviceName", deviceName);	
		capabilities.setCapability("app", app.getAbsolutePath());
	
	    driver = new RemoteWebDriver(new URL(server),
	            capabilities);

		return new HomePage(driver);
	}
}
