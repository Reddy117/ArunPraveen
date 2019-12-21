package com.demo.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlReader {

	public FileInputStream f;
	private XSSFWorkbook wb;
	private XSSFSheet s;
	private XSSFRow r;
	private XSSFCell c;
	
	public String getCellData(String sheetName,int colNum,int rowNum){
		try{
			f=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData/TestData.xlsx");
			wb=new XSSFWorkbook(f);
			s=wb.getSheet(sheetName);
			r=s.getRow(rowNum);
			c=r.getCell(colNum);
			return c.getStringCellValue();
		}catch(Exception e){
			return r+"row not exist"+c+" cell not exist";
		}
		
	}
			
	public static void main(String[] args) {
		XlReader x=new XlReader();
		System.out.println(x.getCellData("Sheet1", 0, 0));
	}		
}
