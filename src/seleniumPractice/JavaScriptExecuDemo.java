package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuDemo {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// draw boarder and takesScreenshot
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		JavaScriptExecUtil.drawBoarder(logo, driver);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\Screenshot\\onkar_\\logo.png");
		try {
			FileUtils.copyDirectory(src, fs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
