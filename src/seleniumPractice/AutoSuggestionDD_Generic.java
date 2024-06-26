package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDD_Generic 
{
	ChromeDriver driver;
	
	public static void main(String[] args) 
	{ 
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.name("q"));
		

	}
	
	public void doSendKeys(String value)
	{
		
        
        
        searchBox.sendKeys(value);
        searchBox.sendKeys(Keys.ENTER);
		
	}
	public void getAutoSuggestionList()

}
