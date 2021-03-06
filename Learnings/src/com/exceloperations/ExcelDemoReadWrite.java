package com.exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDemoReadWrite {
	
	public static void main(String args[]) throws IOException
	{
		String path="D:\\manual.xls";
		HSSFWorkbook wb= new HSSFWorkbook();
		HSSFSheet hs= wb.createSheet("Sheet1");
		
		for(int i=0; i<5; i++)
		{
		 HSSFRow r=hs.createRow(i);
		 for(int j=0; j<5; j++)
		 {
			 HSSFCell c=r.createCell(j);
			 c.setCellValue("Cell " +i + " " +j);
		 }
		}
		
		
		FileOutputStream fileoutput= new FileOutputStream(path);
		wb.write(fileoutput);
		fileoutput.flush();
		fileoutput.close();
		wb.close();
	}

}
