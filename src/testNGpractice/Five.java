package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Five extends LauchQuit
{
	@Test
	void dfg() throws InterruptedException
	{
        WebElement dd=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

	    dd.sendKeys("Formal Shoes");
	    WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
	    search.click();
	   
	}

}
