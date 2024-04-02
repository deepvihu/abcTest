package com.testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(priority=-1)
  public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
  }

  @Test(priority=0)
  @Parameters({"user","pass"})
  public void test1(@Optional("error_user")String user,@Optional("secret_sauce")String pass) {
	  driver.findElement(By.id("user-name")).sendKeys(user);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.id("login-button")).click();
  }
  
  @Test(priority=1)
  public void teardown() {
	  driver.close();
  }

}
