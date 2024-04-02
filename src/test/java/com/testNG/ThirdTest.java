package com.testNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdTest {
  @Test (dataProvider="logindata")
  public void testlog(String usern, String pass) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println("thread Id: " +Thread.currentThread().getId());
		driver.findElement(By.id("user-name")).sendKeys(usern);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).isDisplayed());
		Thread.sleep(1000);
		driver.close();
  }
  @DataProvider (parallel=true)
  public Object[][] logindata()
  {
	  Object[][] data=new Object[3][2];
	  
	  data[0][0]="standard_user";
	  data[0][1]="secret_sauce";
	  
	  data[1][0]="problem_user";
	  data[1][1]="secret_sauce";
	  
	  data[2][0]="error_user";
	  data[2][1]="secret_sauce";

	  return data;
  }
  
}
