package com.exceloperations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mcve{	
    public static void main(String[] args) throws AWTException {

    //Make workbook and first sheet
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("sheet1");

    //Make a style
    XSSFCellStyle style = workbook.createCellStyle();
    style.setFillForegroundColor(IndexedColors.RED.getIndex());
    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    
    
    XSSFCellStyle style1 = workbook.createCellStyle();
    style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    
    style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);

    //Fill first line
    Row row = sheet.createRow(0);
    //row.getCell(0).setCellStyle(style)

    int i = 0;
    while (i < 5) {

        Cell cell = row.createCell(i);
        cell.setCellValue("TestCell " + i++);
         
        if(i%2==0)
        {
        	cell.setCellStyle(style);
        }
        else
        {
        	cell.setCellStyle(style1);
        }
    }
    
    //Robot robot=new Robot();
    //robot.keyPress(KeyEvent.VK_ENTER);

    //Write to file
    File f = new File("D:\\document.xlsx"); //<-- FILL HERE

    try (FileOutputStream out = new FileOutputStream(f)) {
        workbook.write(out);
        workbook.close();
    } catch (Exception e) {
        e.printStackTrace();

    }
}
}
