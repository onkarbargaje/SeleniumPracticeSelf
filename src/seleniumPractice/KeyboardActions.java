package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		/*
		 * WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		 * email.sendKeys("Copy paste");
		 * 
		 * email.sendKeys(Keys.CONTROL+"a"); email.sendKeys(Keys.CONTROL+"c");
		 * WebElement pwd=driver.findElement(By.xpath("//input[@type='password']"));
		 * pwd.sendKeys(Keys.CONTROL+"v"); Thread.sleep(3000);
		 */
		
		
		WebElement DD=driver.findElement(By.xpath("//select[@id='drop1']"));
		DD.click();
		Thread.sleep(3000);
		DD.sendKeys((Keys.ARROW_DOWN));
		DD.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		//List<WebElement> religionList=driver.findElements(By.xpath("//ul[@class='Religion menu menu-open']"));
		
		
		//for (WebElement options:religionList)
		//{
			//System.out.println(options);
			//options.sendKeys(Keys.ARROW_DOWN);
			//options.click();
		//}
		//religionList
		//((WebElement) religionList).sendKeys(Keys.ARROW_DOWN);
		//religionDD.click();
		//Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		

	}

}
