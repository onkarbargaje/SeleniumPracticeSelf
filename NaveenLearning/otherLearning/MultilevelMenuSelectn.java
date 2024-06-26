package otherLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultilevelMenuSelectn 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement category_dd=driver.findElement(By.xpath("(//span[text()='Shop by'])[2]"));
		category_dd.click();
		
		WebElement firstList=driver.findElement(By.linkText("Fruits & Vegetables"));
		WebElement secondList=driver.findElement(By.linkText("Fresh Fruits"));
		WebElement thirdList=driver.findElement(By.linkText("Mangoes"));
		
		Actions act= new Actions(driver);
		act.moveToElement(firstList).click().build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(secondList).click().build().perform();
		Thread.sleep(2000);
		
		//thirdList.click();
		//act.moveToElement(thirdList).click().click();
		//Thread.sleep(2000);
		

}
}

