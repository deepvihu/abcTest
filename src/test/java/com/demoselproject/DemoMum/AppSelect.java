package com.demoselproject.DemoMum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement drop1= driver.findElement(By.cssSelector("#cars"));
		Select s= new Select(drop1);
		
		boolean b= s.isMultiple();
		System.out.println(b);
		
		s.selectByIndex(0);
		s.selectByValue("opel");
		s.selectByVisibleText("Audi");
		//s.deselectAll();
		//s.deselectByIndex(0);
		
		List<WebElement> opt=s.getOptions();
		for(WebElement all:opt)
		{
			String text=all.getText();
			System.out.println(text);
		}
		
		System.out.println("first selected value:");
		WebElement first=s.getFirstSelectedOption();
		System.out.println(first.getAttribute("value"));
		
		s.deselectAll();
		System.out.println("All Selected values");
		List<WebElement> allelements=s.getAllSelectedOptions();
		System.out.println(allelements.size());
		for(WebElement data:allelements)
		{
			String text1=data.getText();
			System.out.println(text1);
		}
		
		driver.close();
		
	}

}
