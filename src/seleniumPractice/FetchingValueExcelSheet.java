package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingValueExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\DDT\\OnkarDDT.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("Sheet1");
		Row r1=s1.getRow(0);
		Cell c1=r1.getCell(0);
		String userName=c1.getStringCellValue();
		
		System.out.println(userName);
		

	}

}
