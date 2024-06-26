package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement photoManager_frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoManager_frame);
		
		
		//List<WebElement> imageList=driver.findElements(By.xpath("//h5[contains(text(),'High Tatras')]"));
		WebElement source=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		
			
		Actions act= new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);
         driver.quit();
	}

}
