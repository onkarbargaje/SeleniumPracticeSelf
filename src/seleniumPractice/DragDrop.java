package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop extends Object
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement source=driver.findElement(By.xpath("//img[@id='drag7']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		Thread.sleep(4000);
		

	}

}
