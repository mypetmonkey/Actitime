package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLiberary {
	/*
	 * 
	 */
	
	
	public String getPropertyfile(String sheetname) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(sheetname);
		return data;
	}
	/*
	 * 
	 */
	  public String getExcelFile(String sheetname,int row,int cell) throws IOException {
		  FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		    String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		  return data;
		  
	  }
	  /*
	   * 
	   */
	  public void setExcelValue(String sheetname,int row,int cell, String value) throws EncryptedDocumentException, IOException {
		  FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		 FileOutputStream fos=new FileOutputStream("./data/testscipt.xlsx");
		 wb.write(fos);
		 wb.close();
	  }
}
