package com.demoselproject.DemoMum;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilScreen {

	public static String takeScreen(WebDriver driver , String filename) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file=  ts.getScreenshotAs(OutputType.FILE);
		String s="C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\Screenshots\\"+filename+".png";
		File dest=new File(s);
		FileUtils.copyFile(file,dest);	
		return(s);
		
		
		
		
		
		
		
		
		
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		File file=  ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("./Screenshots/"+filename+".png"));	
	}
	
	
}
