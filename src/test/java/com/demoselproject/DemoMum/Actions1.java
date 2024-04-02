package com.demoselproject.DemoMum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement createacc= driver.findElement(By.xpath("//a[text()=\"Create Account\"]"));
		
		// single click
		//act.moveToElement(createacc).click().build().perform();
		//act.click(createacc).build().perform();
		
		//double click
		act.moveToElement(createacc).doubleClick().build().perform();
		act.doubleClick(createacc).build().perform();
		
		//right click
		act.moveToElement(createacc).contextClick().build().perform();
		act.contextClick(createacc).build().perform();
		
	}

}
