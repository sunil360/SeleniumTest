package com.phptravels.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderWriter {
	
	private static FileInputStream fis;
	 private static FileOutputStream fileOut;
	 private static XSSFWorkbook wb;
	 private static XSSFSheet sh;
	 private static XSSFCell cell;
	 private static XSSFRow row;
	 private static XSSFCellStyle cellstyle;
	 private static XSSFColor mycolor;
	 private static String path= "C:\\Users\\sunilk\\workspace\\PHPTravels\\src\\test\\resources\\testdata\\PHPTravelsTestcases.xlsx";
	    
	 public static void setExcelFile(String ExcelPath,String SheetName) throws Exception
	 {  
	    try{
	       File f = new File(ExcelPath);
	       if(!f.exists())
	       {
	          f.createNewFile();
	          System.out.println("File doesn't exist, so created!");
	        }  
	        fis=new FileInputStream(path);
	        wb=new XSSFWorkbook(fis);
	        sh = wb.getSheet(SheetName);
	        //sh = wb.getSheetAt(0); //0 - index of 1st sheet
	        if (sh == null)
	        {
	            sh = wb.createSheet(SheetName);
	        }  
	     }catch (Exception e){System.out.println(e.getMessage());}
	 }
	 
	 public static void setCellData(String text, int rownum, int colnum) throws Exception
	 {
		 
	  try{   
	     row  = sh.getRow(rownum);
	     if(row ==null)
	     {
	        row = sh.createRow(rownum);
	     }
	     cell = row.getCell(colnum);
	    if (cell != null) 
	     {
	         cell.setCellValue(text);
	     } 
	     else 
	     {
	          cell = row.createCell(colnum);
	          cell.setCellValue(text);  
	     }
	     fileOut = new FileOutputStream(path);
	     wb.write(fileOut);
	     fileOut.flush();
	     fileOut.close();
	  }catch(Exception e){throw (e);} }
	 
	 public static String getCellData(int rownum, int colnum) throws Exception
	 {
	  try{
	     cell = sh.getRow(rownum).getCell(colnum);
	     String CellData = null;         
	     switch (cell.getCellType()){
	     case Cell.CELL_TYPE_STRING:
	          CellData = cell.getStringCellValue();
	          break;
	     case Cell.CELL_TYPE_NUMERIC:
	          if (DateUtil.isCellDateFormatted(cell))
	          {
	             CellData = cell.getDateCellValue().toString();
	          }
	          else
	          {  
	             CellData = Double.toString(cell.getNumericCellValue());
	             if (CellData.contains(".0"))//removing the extra .0
	              {
	               CellData = CellData.substring(0, CellData.length()-2);
	              }
	           }
	           break;
	     case Cell.CELL_TYPE_BLANK:
	           CellData = "";
	           break;
	     case Cell.CELL_TYPE_BOOLEAN:
	           CellData = Boolean.toString(cell.getBooleanCellValue());
	           break;
	     }      
	        return CellData;
	        }catch (Exception e){return"";}
	 }
	 

}
