package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Two extends LauchQuit
{
	@Test
	void add() throws InterruptedException
	{
        WebElement dd=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

	        dd.sendKeys("Books");
	        WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
	        search.click();
	        
	}

}
