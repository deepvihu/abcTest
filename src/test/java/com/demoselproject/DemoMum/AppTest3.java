package com.demoselproject.DemoMum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
	
		
//		driver.findElement(By.linkText("Images")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.close();
	
		
		
		
		
	}

}
