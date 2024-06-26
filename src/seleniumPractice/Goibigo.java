/**
 * 
 */
package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goibigo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		//driver.get("https://www.goindigo.in/");
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(5000);
		//WebElement acceptCookies_bt=driver.findElement(By.xpath("//button[@class='btn custom-button accept-cookies__block--btn acc-cookie-desktop']"));
		//acceptCookies_bt.click();
		
		//driver.switchTo().frame("cx-iframe");
		//WebElement agreeContinue_bt=driver.findElement(By.xpath("//button[contains(text(),'Agree & Continue')]"));
		//agreeContinue_bt.click();
		
		WebElement popUp=driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		popUp.click();
		
		//WebElement from_tf=driver.findElement(By.xpath("//input[@placeholder='From']"));
		WebElement from_tf=driver.findElement(By.xpath("//span[contains(text(),'From')]"));
		from_tf.click();
		WebElement from_tf1=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from_tf1.sendKeys("Pune");
		WebElement dd_option=driver.findElement(By.xpath("//li[@role='option']//span[contains(text(),'PNQ')]"));
		dd_option.click();
		

	}

}
