package com.testNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.demoselproject.DemoMum.ScreenUtility;
import com.demoselproject.DemoMum.UtilScreen;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentreportTest {
WebDriver driver;
ExtentReports report;
ExtentTest test;

@Test
public void verifytest()
{
	report= new ExtentReports("C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\Reports\\LogReport.html");
	test= report.startTest("VerifyTitle");

	 WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		test.log(LogStatus.INFO, "Browser Started");
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Application loaded");
		
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("SwagLabs"));
		test.log(LogStatus.PASS, "Title verified");
}

@AfterMethod
public void closedown(ITestResult result) throws IOException
{
	  if(ITestResult.FAILURE==result.getStatus())
	  {
		String screen=UtilScreen.takeScreen(driver,result.getName());
		String image= test.addScreenCapture(screen);
		test.log(LogStatus.FAIL,"Title mismatched", image);
	  }
	  report.endTest(test);
	  report.flush();
	  driver.get("C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\Reports\\LogReport.html");
}
	
	
}
