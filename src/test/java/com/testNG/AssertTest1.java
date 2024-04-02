package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTest1 {

	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String exp = "Swag Labs";
		String act=driver.getTitle();
	//	Assert.assertEquals(exp, act);
		Assert.assertEquals(exp,act,"title mismatched");
		
		String exp1="https://www.saucelabs.com";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(exp1,driver.getCurrentUrl());
		soft.assertAll();
		
	}
	
	
}
