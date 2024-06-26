package otherLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	
	static WebDriver driver;
	   
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#default");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(frame);
	//driver.switchTo().frame(1);
	Thread.sleep(2000);
	WebElement bar=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	bar.click();
	
	WebElement slider=driver.findElement(By.id("slider"));
	
	int width=slider.getSize().getWidth();
	System.out.println(width); //21
	
	Actions act= new Actions(driver);
	act.moveToElement(bar, (width/2) - 50, 0).click().build().perform();
   
}
}
