package com.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends AbstractPage{

	public CalculatorPage (WebDriver driver) {
		super(driver);
	}
	
	public CalculatorPage verifyCalculatorPageIsLoaded(){
		
    	WebElement calcLabel = driver.findElement(By.name("Calculator"));
    	WebElement numberField1 = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]"));
    	WebElement numberField2 = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[2]"));
    	WebElement addButton = driver.findElement(By.name("Add"));
    	WebElement resultLabel = driver.findElement(By.name("Answer"));
    	
    	Assert.assertEquals(calcLabel.getText(), "Calculator");
    	Assert.assertTrue(numberField1.isDisplayed());
    	Assert.assertTrue(numberField2.isDisplayed());
    	Assert.assertTrue(addButton.isDisplayed());
    	Assert.assertTrue(resultLabel.isDisplayed());

		return new CalculatorPage(driver);
	}
	
}
