package com.demoselproject.DemoMum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).
		sendKeys("udaipur");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//span[text()=\"Search\"]")).click();
		
		
		
		
//		String title = driver.getTitle();
//		System.out.println("title : "+title);
//		
//		System.out.println(driver.getCurrentUrl());
//		
//		WebElement logbtn= driver.findElement(By.id("login-button"));
//		System.out.println(logbtn.getAttribute("name"));
//		System.out.println(logbtn.getCssValue("width"));
//		System.out.println(logbtn.getTagName());
		
		
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
//		String text1=driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();		
//		System.out.println(text1);
	}

}
