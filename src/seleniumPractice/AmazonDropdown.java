package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver= new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		
		
		//driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=676742245330&hvpos=&hvnetw=g&hvrand=4083480220870443321&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062107&hvtargid=kwd-362216169274&hydadcr=5620_2408760&gad_source=1");
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement hover=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        
        
        // Action class to perform hover over
        Actions a1= new Actions(driver);
        a1.moveToElement(hover).perform();
        WebElement signIN=driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
        signIN.click();
        TakesScreenshot ts= (TakesScreenshot)driver;
        File source= ts.getScreenshotAs(OutputType.FILE);
        
        File destination= new File("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\Screenshot\\onkar.png");
        FileUtils.copyFile(source, destination);
        
        //WebElement dd=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        //dd.click();
        
        //Select s= new Select(dd);
        //s.selectByVisibleText("Electronics");
        //s.selectByIndex(1);
        //WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        //search.click();
       
        
        Thread.sleep(4000);
        driver.close();
        
        
        
        
        
	}

}
