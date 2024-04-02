package com.demoselproject.DemoMum;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.google.common.collect.Table.Cell;

public class Datatable2 {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\ExcelData\\data1.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook w= new XSSFWorkbook(fis);
		Sheet s=w.getSheetAt(0);
		//Sheet s1=w.getSheet("TestData");
		// row
		int row=s.getFirstRowNum();
		int row1=s.getLastRowNum();
		System.out.println(row+" "+row1);
		
		// cell
		int col=s.getRow(0).getFirstCellNum();
		int col1=s.getRow(0).getLastCellNum();
		System.out.println(col+" "+col1);
		
		int col3=s.getRow(1).getFirstCellNum();
		int col4=s.getRow(1).getLastCellNum();
		System.out.println(col3+" "+col4);

		// physical rows & cols
		int r=s.getPhysicalNumberOfRows();
		System.out.println("physical rows "+r);
		
		int c=s.getRow(0).getPhysicalNumberOfCells();
		int c1=s.getRow(1).getPhysicalNumberOfCells();
		System.out.println(c+" "+c1);

		w.close();
		fis.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// 1st way
//		Row r=s.getRow(1);
//		Cell c=r.getCell(1);
//		System.out.println(c);
//		
//		// 2nd way
//		String cellvalue=s.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(cellvalue);
//		String cellvalue1=s.getRow(0).getCell(1).getStringCellValue();
//		System.out.println(cellvalue1);
//		String cellvalue2=s.getRow(0).getCell(2).getStringCellValue();
//		System.out.println(cellvalue2);
//		Boolean cellvalue3=s.getRow(0).getCell(3).getBooleanCellValue();
//		System.out.println(cellvalue3);
//		Number cellvalue4= s.getRow(1).getCell(3).getNumericCellValue();
//		System.out.println(cellvalue4);
		
		
	}

}
