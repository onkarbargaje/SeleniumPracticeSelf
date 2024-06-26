package seleniumPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 
{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		driver= new ChromeDriver();
		driver.get("https://www.infosys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String parentWindowTitle=driver.getTitle();
		
		WebElement bottomElement=driver.findElement(By.xpath("//p[contains(text(),'Connect with us')]"));
        
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", bottomElement);
		
		Thread.sleep(5000);
		
		
		WebElement twitterImg=driver.findElement(By.xpath("(//a[@title='Follow us on Twitter'])[2]"));
		WebElement facebookImg=driver.findElement(By.xpath("(//a[@title='Follow us on Facebook'])[2]"));
		WebElement linkedInImg=driver.findElement(By.xpath("(//a[@title='Follow us on LinkedIn'])[2]"));
		twitterImg.click();
		facebookImg.click();
		linkedInImg.click();
		
	   Set <String> windows=	driver.getWindowHandles();
	   Iterator<String> it=windows.iterator();
	   while(it.hasNext())
	   {
		   String childWindowID=it.next();
		   driver.switchTo().window(childWindowID);
		   String childWindowTitle=driver.getTitle();
		   System.out.println(childWindowTitle);
		   
		   if(!parentWindowTitle.equals(childWindowTitle))
		   {
			   driver.close();
		   }
	   }
	  
	   
		
		
		
	}
	
	
	public static String getWindowTitle(String childWindowID)
	{
		driver.switchTo().window(childWindowID);
		String childWindowTitle=driver.getTitle();
		return childWindowTitle;
		
	}

}
