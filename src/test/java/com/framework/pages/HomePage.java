package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public CalculatorPage clickOnCalculator(){
    	WebElement calc_link = driver.findElement(By.name("Calculator"));
    	calc_link.click();		
		return new CalculatorPage(driver);
	}
	
	public MorePage clickOnMore(){
    	WebElement more_link = driver.findElement(By.name("More"));
    	more_link.click();				
		return new MorePage(driver);
	}
	
	
}
