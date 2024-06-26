package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");
		driver.manage().window().maximize();
		
        //to get number of iframe present on page
        
        List<WebElement> noOfFrames=driver.findElements(By.tagName("iframe"));
        noOfFrames.size();
        System.out.println("Number of iframe on this page are "+ noOfFrames.size());
        WebElement frameElement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frameElement);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        
        Actions act= new Actions(driver);
       act.dragAndDrop(source, target).perform();
        //act.clickAndHold(source).MoveToElement(target).release().
        Thread.sleep(3000);
        driver.quit();

        
        
	}

}
