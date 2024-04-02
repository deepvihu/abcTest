package com.testNG;

import org.testng.annotations.Test;

import com.demoselproject.DemoMum.ScreenUtility;
import com.demoselproject.DemoMum.UtilScreen;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class SecondTest {
	WebDriver driver;

  @BeforeTest
  public void initBrowser() {
	  WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
  }
  @Test
  public void logtest() throws InterruptedException {
	 // Thread.sleep(3000);
	  driver.findElement(By.id("username")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
  }
  
  @AfterTest
  public void teardown() {
	  driver.close();
  }
  
  @AfterMethod
  public void closedown(ITestResult result) throws IOException
  {
	  if(ITestResult.FAILURE==result.getStatus())
	  {
		 // UtilScreen.takeScreen(driver, result.getName());  // "error1" 
	  ScreenUtility.captureScreen(driver);
	  }
  }
  

}
