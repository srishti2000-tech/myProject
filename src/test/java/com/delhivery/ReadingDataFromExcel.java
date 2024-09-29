package com.delhivery;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		  String dir = System.getProperty("user.dir");
		  String fileName = dir+"/testData/file1.xlsx" ;
		  FileInputStream file = new FileInputStream(fileName);
		  XSSFWorkbook workbook =new XSSFWorkbook(file); 
		  XSSFSheet sheet = workbook.getSheetAt(0);
		  //XSSFSheet sheet = workbook.getSheet("Sheet1"); 
		  int rowcount =  sheet.getLastRowNum();// returns the row count 
		  int colcount = sheet.getRow(0).getLastCellNum();//returns column cell count
		  for(int i=0;i<rowcount;i++) 
		  { 
			  XSSFRow currentrow = sheet.getRow(i);//focussed on current row 
			  for(int j=0;j<colcount;j++) 
			  { String value = currentrow.getCell(j).toString();// read the value from a cell
			  	System.out.println(value); 
			  } 
		  }
		
		
		
		
	}

}
