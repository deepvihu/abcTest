package com.demoselproject.DemoMum;

import java.awt.AWTException;
//import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotTest1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Robot r = new Robot();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
//		WebElement login= driver.findElement(By.id("login-button"));
//		Point p= login.getLocation();
//	    System.out.println(p.getX());
//		System.out.println(p.getY());
		
		
		r.delay(1000);
		r.mouseMove(520, 450);   // location x & y login
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_C);
//		
//		r.delay(1000);
//		r.keyPress(KeyEvent.VK_TAB); // pwd field
//		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		r.delay(1000);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
