package com.demoselproject.DemoMum;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gourmetgarden.in/");
		driver.manage().window().maximize();
		
		// Pageload timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		// implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		 WebElement login=driver.findElement(By.xpath("//a[@href=\"/account/login\"]"));
		 // explicit wait
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(6));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/account/login\"]"))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	
		 // fluent wait
		 Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
				 .pollingEvery(Duration.ofSeconds(2))
				 .withMessage("Fluent wait")
				 .ignoring(TimeoutException.class);
		 wait1.until(ExpectedConditions.visibilityOf(login)).click();
	}

}
