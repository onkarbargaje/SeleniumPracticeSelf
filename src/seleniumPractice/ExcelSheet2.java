package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement FName=driver.findElement(By.id("firstName"));
		//FName.sendKeys(Famee);
		
		WebElement LName=driver.findElement(By.id("lastName"));
		WebElement Email=driver.findElement(By.id("userEmail"));
		WebElement userMobile=driver.findElement(By.id("userNumber"));
		WebElement subjects=driver.findElement(By.id("subjectsContainer"));
	    WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	    
	    FileInputStream f2= new FileInputStream("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\DDT\\OnkarDDT.xlsx");
	    Workbook w1= WorkbookFactory.create(f2);
	    Sheet s1=w1.getSheet("DemoQA");
	    String Famee=w1.getSheet("DemoQA").getRow(0).getCell(1).getStringCellValue();
	    FName.sendKeys(Famee);
	    
	    String Lamee=s1.getRow(1).getCell(1).getStringCellValue();
	    LName.sendKeys(Lamee);
	    
	    String email=s1.getRow(2).getCell(1).getStringCellValue();
	    Email.sendKeys(email);
	    
	    String userMobilee=s1.getRow(3).getCell(1).getStringCellValue();
	    userMobile.sendKeys(userMobilee);
	    
	    //String subject=s1.getRow(4).getCell(1).getStringCellValue();
	    //subjects.click();
	    //subjects.sendKeys(subject);
	    
	    String cAddress=  s1.getRow(5).getCell(1).getStringCellValue();
	    currentAddress.sendKeys(cAddress);
	    
	    Thread.sleep(4000);
	    driver.close();
	    
	    
	    
	
	
	}

}
