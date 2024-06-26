package otherLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
   static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.xpath("(//div[text()='SpiceClub'])[1]"));
		Actions act= new Actions(driver);
		act.moveToElement(dd).build().perform();
		Thread.sleep(2000);
		
		WebElement benefit=driver.findElement(By.xpath("(//div[text()='Benefits'])[1]"));
		benefit.click();
		
		
		
		
		

	}

}
