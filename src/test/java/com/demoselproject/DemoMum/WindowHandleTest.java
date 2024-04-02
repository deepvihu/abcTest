package com.demoselproject.DemoMum;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String parenthandle= driver.getWindowHandle();
		System.out.println(parenthandle);
		
		WebElement login=driver.findElement(By.xpath("//a[@href=\"https://post.magicbr\"]"));
		
		 // fluent wait
		 Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(15))
				 .pollingEvery(Duration.ofSeconds(2))
				 .withMessage("Fluent wait")
				 .ignoring(TimeoutException.class);
		 wait1.until(ExpectedConditions.elementToBeClickable(login)).click();
	
		 
		 Set<String> handle =driver.getWindowHandles();
		for(String h: handle)
		{
			System.out.println(h);
		}
		Thread.sleep(2000);
		driver.switchTo().window(parenthandle);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> handle =driver.getWindowHandles();  // 4 tabs
//		for(String h: handle)
//		{
//			System.out.println(h);
//			if(parenthandle.equals(h))
//			{
//				driver.switchTo().window(parenthandle);
//				System.out.println(driver.switchTo().window(parenthandle).getTitle());
//			}
//		}
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
