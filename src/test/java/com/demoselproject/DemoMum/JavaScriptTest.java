package com.demoselproject.DemoMum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(3000);
//		WebElement searchbox = driver.findElement(By.id("srchquery_tbox"));
//		js.executeScript("arguments[0].setAttribute('value','IPL Schedule');", searchbox);
		Thread.sleep(1000);
//		WebElement searchicon = driver.findElement(By.xpath("//form[@name=\"srchform\"]/child::input"));
//		js.executeScript("arguments[0].click();", searchicon);
		
		
		WebElement uname = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','Standard_user');", uname);
		
		Object obj=js.executeScript("return arguments[0].getAttribute('value');", uname);
		String s=(String)obj;
		System.out.println(s);
		
		
		
		
		
		//refresh
//		js.executeScript("location.reload()");
//		
//		Thread.sleep(3000);
//		// scroll the page 1st- horizontal  2nd- vertical
//		js.executeScript("window.scrollBy(0,500)");

	}

}
