package com.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MorePage extends AbstractPage {

	public MorePage(WebDriver driver) {
		super(driver);
	}
	
	public MorePage verifyMorePageIsLoaded(){
    	WebElement pageTitle = driver.findElement(By.name("Welcome To More"));
    	WebElement clickBtn = driver.findElement(By.name("Click"));
    	
    	Assert.assertEquals(pageTitle.getText(), "Welcome To More");
    	Assert.assertTrue(clickBtn.isDisplayed());
		
		return new MorePage(driver);
		
	}
}
