package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public static String getPropertyData(String key) throws IOException	
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	public static String readExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		System.out.println("after fis");
		Workbook wb=WorkbookFactory.create(fis);
		System.out.println("after wb");
		//row starts from 1,2 3 cell starts from 0,1,2
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		//
		return data;
	}

}
