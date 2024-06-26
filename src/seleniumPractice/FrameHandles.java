package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandles {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        driver.manage().window().maximize();
        
        
        //to get number of iframe present on page
        
        List<WebElement> noOfFrames=driver.findElements(By.tagName("iframe"));
        noOfFrames.size();
        System.out.println("Number of iframe on this page are "+ noOfFrames.size());
        
        //swiching to frame by using name attribute of iframe
        
        //driver.switchTo().frame(By.name("globalSqa"));
        driver.switchTo().frame("globalSqa");
        
        WebElement headerName=driver.findElement(By.xpath("//div[@class='page_heading']//h1[contains(text(),'Trainings')]"));
        System.out.println(headerName.getText());
        
        //switching back to main content and click on the 'OPEN NEW TAB'
        
        driver.switchTo().defaultContent();
       // driver.switchTo().parentFrame();
        Thread.sleep(3000);
        WebElement newTab=driver.findElement(By.xpath("//*[@id='Open New Tab']"));
        newTab.click();
        driver.quit();
        
	}
	

}
