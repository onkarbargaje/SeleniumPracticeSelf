package seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderByExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File excelFile= new File("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\DDT\\DataProvider1.xlsx");
		System.out.println(excelFile.exists());
		
		FileInputStream fis= new FileInputStream(excelFile);
		Workbook w1= WorkbookFactory.create(excelFile);
		Sheet s1=w1.getSheet("Sheet1");
		
		System.out.println(s1.getPhysicalNumberOfRows());
		// to get number of columns
		System.out.println(s1.getRow(0).getLastCellNum());
		System.out.println(s1.getRow(4).getLastCellNum());
		
		int noOfRows=s1.getPhysicalNumberOfRows();
		int noOfColumns=s1.getRow(0).getLastCellNum();
		
		for (int i = 1; i < noOfRows; i++) //i=1 as i=o contains excel headers
		{
			for (int j = 0; j < noOfColumns; j++) 
			{
			 System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
				
				
			}
			System.out.println();
		}
		
		w1.close();
		fis.close();
	}

}
