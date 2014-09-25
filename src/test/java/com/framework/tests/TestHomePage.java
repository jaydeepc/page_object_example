package com.framework.tests;

import org.junit.After;
import org.junit.Test;
import com.framework.pages.HomePage;

public class TestHomePage extends BaseTest{

	
	@Test
    public void testCalculatorButtonWorks() {				
		HomePage onHomePage = new HomePage(driver);		
		onHomePage
			.clickOnCalculator()
			.verifyCalculatorPageIsLoaded();		
	}
	
	@Test
	public void testMoreButtonWorks(){
		HomePage onHomePage = new HomePage(driver);		
		onHomePage
			.clickOnMore()
			.verifyMorePageIsLoaded();
	}

	@After
	public void tearDown(){
		driver.quit();
	}

}
