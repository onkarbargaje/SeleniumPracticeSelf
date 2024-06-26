package amz_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Amazon_DDT 
{
	public static String unameExcelData;
	public static  String upasswordExcelData;
	public static  String search2ExcelData;
	public static  String search3ExcelData;
	public static  String search15ExcelData;
	public static  String search16ExcelData;
	public static  String search17ExcelData;
	public static  String search19ExcelData;
	public static  String search20ExcelData;
	
	 public void excelData() throws EncryptedDocumentException, IOException 
	  {
	     FileInputStream f2= new FileInputStream("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\DDT\\OnkarDDT.xlsx");
	    Workbook w1= WorkbookFactory.create(f2);
	    Sheet s1=w1.getSheet("Amazon");
	    unameExcelData=s1.getRow(0).getCell(1).getStringCellValue();
	    upasswordExcelData=s1.getRow(1).getCell(1).getStringCellValue();
	    search2ExcelData=s1.getRow(2).getCell(1).getStringCellValue();
	    search3ExcelData=s1.getRow(3).getCell(1).getStringCellValue();
	    search15ExcelData=s1.getRow(4).getCell(1).getStringCellValue();
	    search16ExcelData=s1.getRow(5).getCell(1).getStringCellValue();
	    search17ExcelData=s1.getRow(6).getCell(1).getStringCellValue();
	    search19ExcelData=s1.getRow(7).getCell(1).getStringCellValue();
	    search20ExcelData=s1.getRow(8).getCell(1).getStringCellValue();
	    System.out.println(unameExcelData);
	    System.out.println(upasswordExcelData);
	  
	  
	  }
	 


}


