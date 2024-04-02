package com.demoselproject.DemoMum;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable1 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\ExcelData\\data2.xls");
		FileOutputStream fos= new FileOutputStream(file);
		
		// create workbook
		Workbook w= new HSSFWorkbook();
		//XSSFWorkbook w= new XSSFWorkbook();
		
		// create sheet
		Sheet s=w.createSheet();
		
		// create row
		s.createRow(0);
		
		// create cell & pass the value.
		s.getRow(0).createCell(0).setCellValue("Hello");
		s.getRow(0).createCell(1).setCellValue("Capgemini");
		s.getRow(0).createCell(2).setCellValue("Welcome");
		
		s.createRow(1);
		s.getRow(1).createCell(0).setCellValue("Rashida");
		s.getRow(1).createCell(1).setCellValue("Vaidehi");
		s.getRow(1).createCell(2).setCellValue("Nandani");
		
		
		// another sheet
		Sheet s1 = w.createSheet("TestData");
		s1.createRow(0);
		
		// create cell & pass the value.
		s1.getRow(0).createCell(0).setCellValue("Hello");
		s1.getRow(0).createCell(1).setCellValue("Capgemini");
		s1.getRow(0).createCell(2).setCellValue("Welcome");
		
		w.write(fos);
		w.close();
		
	}

}
