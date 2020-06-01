package com_Spicejet_TestCases;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities 
{
	private FileInputStream fi;
	private XSSFWorkbook excelWBook; 
	private XSSFSheet excelWSheet;
	//private XSSFRow row;
	private XSSFCell cell;
	private DataFormatter df;
	
	
	//************************To Open an Existing Excel File********************************
	public XSSFSheet OpenExcelFileSheet(String xlFilePath,String xlSheetName) throws IOException
	{
		fi=new FileInputStream(xlFilePath);
		excelWBook=new XSSFWorkbook(fi);
		excelWSheet=excelWBook.getSheet(xlSheetName);
		return excelWSheet;
	}
	
	//******************To Count Rows in a given Excel Sheet of a given Excel file ********************************
	public  int GetRowCount(String xlFilePath,String xlSheetName) throws IOException
	{
		
		int totalRow = OpenExcelFileSheet(xlFilePath,xlSheetName).getLastRowNum();
		excelWBook.close();
		fi.close();
		
		return totalRow;
	}
	
	//******To Count Cells in a given Excel Sheet of a given Excel file of a particular ROw ********************************
	public int GetCellCount(String xlFilePath,String xlSheetName,int numRow) throws IOException
	{
		int totalCell =OpenExcelFileSheet(xlFilePath,xlSheetName).getRow(numRow).getLastCellNum();
		excelWBook.close();
		fi.close();
		
		return totalCell;
	}
	
	public String GetCellData(String xlFilePath,String xlSheetname,int rowNum,int colNum) throws IOException
	{
		cell =OpenExcelFileSheet(xlFilePath,xlSheetname).getRow(rowNum).getCell(colNum);
		String celldata;
		try
		{
			 df=new DataFormatter();
			 celldata=df.formatCellValue(cell);
			return celldata;
		}
		catch (Exception e)
		{
			celldata="";
		}
		excelWBook.close();
		fi.close();
		return celldata;
	}
	
	public int traverseExcelSheet(String xlFilePath, String xlSheetname) throws IOException {
		String value;
		Boolean breaker = false;
		excelWSheet= OpenExcelFileSheet(xlFilePath,xlSheetname);
		Iterator<Row> rit = excelWSheet.iterator();
		System.out.println("Hello");
		
		try {
		while(rit.hasNext() && !breaker) {
			System.out.println("Hello0");
			Row row = rit.next();
			System.out.println("Hello1");
			Iterator<Cell> cit = row.iterator();
			System.out.println("Hello2");
			while(cit.hasNext() && !breaker) {
				System.out.println("Hello3");

				Cell cell = cit.next();
				System.out.println("Hello4");

				value = df.formatCellValue(cell);
				System.out.println("Hello5");

				System.out.print(value);
				System.out.println("Hello6");

				if(value.contentEquals("EndOfTestCase")) {
					breaker = true;
				}
			}
			System.out.println("next Row");
		}
		}
		catch (Exception e)
		{
			System.out.println("Exception ==>"+e);
		}
		System.out.println("Bye :");
		return excelWBook.getSheetIndex(excelWSheet);
		
	}
	
	
	
	
}
