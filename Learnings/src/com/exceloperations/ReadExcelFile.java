package com.exceloperations;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelFile {

	public static void main(String[] args) {
		
		File file=null;
		try
		{

           file=new File("C:\\Users\\sunilk\\Desktop\\JollyJiraTesting.xlsx");
           FileInputStream fis= new FileInputStream(file);
           // Load workbook
           XSSFWorkbook wb=new XSSFWorkbook(fis);
           
           // Load sheet- Here we are loading first sheetonly
              XSSFSheet sh1= wb.getSheet("DeviceList");
              
         
          // getRow() specify which row we want to read.

          // and getCell() specify which column to read.
          // getStringCellValue() specify that we are reading String data.
           
           System.out.print(sh1.getRow(1).getCell(0).getNumericCellValue());

           System.out.println("  " + sh1.getRow(1).getCell(1).getStringCellValue());

           System.out.print(sh1.getRow(2).getCell(0).getNumericCellValue());

           System.out.println("  " + sh1.getRow(2).getCell(1).getStringCellValue());

           System.out.print(sh1.getRow(3).getCell(0).getNumericCellValue());

           System.out.println("  " +sh1.getRow(3).getCell(1).getStringCellValue());
           
           //System.out.println("File found");

	      }
		catch(Exception ex)
		{
			System.out.println(ex);
		}

 }
}