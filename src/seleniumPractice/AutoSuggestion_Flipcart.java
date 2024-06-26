package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Flipcart {

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
	     driver.manage().window().maximize();
	     WebElement close=driver.findElement(By.xpath("//span[@role='button']"));
	     close.click();
	     //WebElement login=driver.findElement(By.xpath("//div[@class='_1Us3XD']/div/a[@title='Login']"));
	     //login.click();
	     //Thread.sleep(4000);
	     //WebElement more=driver.findElement(By.xpath("//div[@class='exehdJ']"));
	     //more.click();
	     //Thread.sleep(2000);
	     //List<WebElement> list=driver.findElements(By.xpath("//div[@class='_1bQ5Pp']/ul/li"));
	     //list.size();
	     driver.close();

	}

}
