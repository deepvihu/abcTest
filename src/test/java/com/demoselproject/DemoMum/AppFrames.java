package com.demoselproject.DemoMum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		
		WebElement frame2 = driver.findElement(By.xpath(""));
		driver.switchTo().frame(frame2);
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\"Visit W3Schools\"]")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn")).click();
	}

}
