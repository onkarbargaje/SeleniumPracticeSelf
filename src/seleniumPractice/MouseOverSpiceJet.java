package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverSpiceJet {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement addOn=driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
		//Actions act= new Actions(driver);
		//act.moveToElement(addOn).click();
		addOn.click();
		Thread.sleep(3000);
		
		WebElement addOnDD=driver.findElement(By.xpath("//div[contains(text(),'Extra Seat')]"));
        addOnDD.click();
        Thread.sleep(3000);
        driver.quit();

	}

}
