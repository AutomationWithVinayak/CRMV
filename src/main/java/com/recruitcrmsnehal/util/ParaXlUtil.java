package com.recruitcrmsnehal.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.recruitcrmsnehal.base.TestBase;

public class ParaXlUtil extends TestBase{


	public ParaXlUtil() throws IOException {
		super();

	}
	


	public String getDataFromExcel(int a , int b) throws EncryptedDocumentException, IOException {

		FileInputStream FILE = new FileInputStream(pro.getProperty("ExcelPath"));	

		Sheet sheet =WorkbookFactory.create(FILE).getSheet("Sheet1");
		String data =sheet.getRow(a).getCell(b).getStringCellValue();

		return data;
	}


}
