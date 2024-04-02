package com.demoselproject.DemoMum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatepickerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.cssSelector("#datePickerMonthYearInput")).click();
		
		// expectation
		String y="2024";
		String m="August";
		String d="23";
		
		while(true)
		{String monthYear=driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]"))
					.getText();   // march2024   april2024
			String arr[]=monthYear.split(" ");
			String month=arr[0];	// march
			String year=arr[1];		// 2024
			
			if(month.equalsIgnoreCase(m) && year.equalsIgnoreCase(y))
				break;
			else
			driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/button[2]"))
			.click();			// arrow button (go to next month)		
		}
		
		// date
		driver.findElement(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]"))
		.click();
		
//		// date 
//		List<WebElement> all=driver.findElements(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]"));
//		for(WebElement e: all)
//		{
//		String date = e.getText();	//1  2  3
//		if(date.equals(d))
//		{
//			e.click();
//			break;
//		}
//		}
		
		
	}

}
