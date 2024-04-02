package com.demoselproject.DemoMum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		 List<WebElement> all= driver.findElements(By.tagName("input"));
		System.out.println("number of elements: " +all.size());
		
		for(int i=0;i<all.size();i++)
		{
			System.out.println("elements name: " +all.get(i).getAttribute("name"));		
		}
		driver.close();
	}

}
