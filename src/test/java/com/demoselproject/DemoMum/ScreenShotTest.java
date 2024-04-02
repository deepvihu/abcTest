package com.demoselproject.DemoMum;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		ScreenUtility.captureScreen(driver);
		driver.findElement(By.id("login-button")).click();
		ScreenUtility.captureScreen(driver);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File file=  ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("./Screenshots/image.png"));
//		
//		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destfile = new File("./Screenshots/image1.png");
//		FileUtils.copyFile(srcfile, destfile);
		
		
		
		
		
		
		
		
		
		
	}

}
