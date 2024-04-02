package com.demoselproject.DemoMum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement src= driver.findElement(By.id("draggable"));
		WebElement dest= driver.findElement(By.id("droppable"));
		
		
		act.dragAndDrop(src, dest).perform();
		
		if(dest.getText().matches("Dropped!"))
		{
			System.out.println("Successful");
		}
		
		
		
		WebElement slidder=driver.findElement(By.xpath(""));
		
		act.dragAndDropBy(slidder,-100 , 234).perform();
		
		
		
		
//		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		
//		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
//		
//		driver.findElement(By.id("login-button")).sendKeys(Keys.ENTER);
		
	}

}
