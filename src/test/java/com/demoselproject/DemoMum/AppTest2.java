package com.demoselproject.DemoMum;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		  // Fluent Wait
			Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(15))
					.pollingEvery(Duration.ofSeconds(3))
					.withMessage("fluent wait")
					.ignoring(NoSuchElementException.class);
					
			wait1.until(ExpectedConditions
		.visibilityOfElementLocated(By.id("login-butt"))).click();
			
			
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.linkText("Images")).click();
//		driver.findElement(By.partialLinkText("Ima")).click();
		
	}

}
