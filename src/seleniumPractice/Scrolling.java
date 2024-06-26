package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling 
{
	
    /**
     * 
     * @param args
     * @throws InterruptedException
     * @throws IOException
     */
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement jp=driver.findElement(By.xpath("(//a[@class='nav_a'])[29]"));
		Point xy=jp.getLocation();
		int x= xy.getX();
		int y=xy.getY();
		System.out.println(x );
		System.out.println(y );
		
		
		
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1766)");
		 js.executeScript("window.scrollBy(0,"+y+")"); //
		 
		 TakesScreenshot ts= (TakesScreenshot)driver;
		 File sourc=ts.getScreenshotAs(OutputType.FILE);
		 File destinatio= new File("C:\\Users\\Onkar Bargaje\\eclipse-workspace\\seleniumPractice\\Screenshot\\"+Math.random()+" .png");
		 FileUtils.copyDirectory(sourc, destinatio);
		 driver.close();
		 

	}

}
