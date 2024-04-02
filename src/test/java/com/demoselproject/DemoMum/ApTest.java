package com.demoselproject.DemoMum;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//System.setProperty("Webdriver.chrome.driver", "‪C:\\drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
//		driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		//Thread.sleep(2000);
//
//		Robot r = new Robot();
//		r.mouseMove(425, 200);
//		r.delay(1000);
//		r.mouseMove(425, 250);
//		r.delay(1000);
//		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(5000);
		
		
		
		
		
		
		
//	WebElement image=driver.findElement(By.xpath("//img[@src=\"https://b.zmtcdn.com/web_assets/81f3ff974d82520780078ba1cfbd453a1583259680.png\"]"));
//		System.out.println(image.isDisplayed());
//		System.out.println(image.isSelected());
//		Thread.sleep(2000);
//		WebElement btn=driver.findElement(By.xpath("//span[text()=\"Share App Link\"]"));
//		
//		System.out.println(btn.isEnabled());
		

		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement pwd= driver.findElement(By.cssSelector("#password"));
		pwd.sendKeys("secret_sauce");
	//	pwd.clear();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.mouseMove(550, 450);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
//		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		
		
		
		
		
		
		
		//driver.findElement(By.tagName("input")).click();
	//	driver.findElement(By.className("submit-button btn_action")).click();
		
		//Thread.sleep(1000);
		//driver.close();
		//driver.quit();
		
	}
	
	
}
