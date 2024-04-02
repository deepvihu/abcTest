package com.demoselproject.DemoMum;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.google.common.collect.Table.Cell;

public class Datatable3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		File file=new File("C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\ExcelData\\test.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook w= new XSSFWorkbook(fis);
		Sheet s=w.getSheetAt(0);
		
		
		int row=s.getLastRowNum();
		//int col=s.getRow(1).getLastCellNum();
		
			for(int i=1;i<=row;i++)
			{
				Row r=s.getRow(i);
				
				String user=r.getCell(0).getStringCellValue();
				String pass=r.getCell(1).getStringCellValue();
	
				driver.findElement(By.id("user-name")).sendKeys(user);	
				 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
				 driver.findElement(By.xpath("//input[@id='login-button']")).click();
				 
				 driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
				  System.out.println(i +" . "+user+" || "+pass);
			}
			w.close();
			fis.close();
		
		
		
//		
//		int rows=s.getLastRowNum();
//		int cols=s.getRow(1).getLastCellNum();
//		for(int i=0;i<=rows;i++)
//			{
//				Row r=s.getRow(i);
//				for(int j=0;j<cols;j++)
//				{
//					Cell c=r.getCell(j);
//					
//					switch(c.getCellType())
//					{
//					case STRING: System.out.print(c.getStringCellValue());
//					break;
//					
//					case BOOLEAN: System.out.print(c.getBooleanCellValue());
//					break;
//					
//					case NUMERIC: System.out.print(c.getNumericCellValue());
//					break;
//					
//					default:
//						break;
//					}
//					System.out.print(" | ");
//				}
//				System.out.println();
//			}
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
//		{
//			Row r=s.getRow(i);
//			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
//			{
//				Cell c=r.getCell(j);
//				System.out.print(" | ");
//				System.out.print(c);
//			}
//			System.out.println();
//		}
		

		
		
//		int rows=s.getLastRowNum();
//		int cols=s.getRow(1).getLastCellNum();
//		
//		for(int i=0;i<=rows;i++)
//		{
//			Row r=s.getRow(i);
//			for(int j=0;j<cols;j++)
//			{
//				Cell c=r.getCell(j);
//				System.out.print(" "+c);
//			}
//		}
//		w.close();
//		fis.close();
		
	}

}
