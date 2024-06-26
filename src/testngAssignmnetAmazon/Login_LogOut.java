package testngAssignmnetAmazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_LogOut 
{
	ChromeDriver driver;
	WebElement dd;
	@BeforeMethod
	void login()
	{
		driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement signIN=driver.findElement(By.xpath("//a[@class='nav-action-signin-button']"));
		//signIN.click();
		//driver.close();
		
	}
	
	@AfterMethod
	void CheckOut() throws IOException
	{
		//WebElement proceedToBuy=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		//proceedToBuy.click();
		TakesScreenshot ts= (TakesScreenshot)driver;
        File source= ts.getScreenshotAs(OutputType.FILE);
        
        File destination= new File("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\Screenshot\\onkar_"+ Math.random()+".png");
        FileUtils.copyFile(source, destination);
		driver.quit();
	}

}
