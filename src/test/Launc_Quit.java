package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launc_Quit 
{
	ChromeDriver driver;
	WebElement dd;
	@BeforeMethod
	void login()
	{
		 driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
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
