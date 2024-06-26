package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LauchQuit 
{
	ChromeDriver driver;       //declare
	WebElement dd; 
	@BeforeMethod
    void launch()
    {
    	    driver= new ChromeDriver();      //Initialization
			driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        
    }
	@AfterMethod
    void quit() throws InterruptedException
    {
    	Thread.sleep(2000);
        driver.close();
    }
	
	
	
}
