package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Three  extends LauchQuit
{
	@Test
	void multi() throws InterruptedException
	{ 
        WebElement dd=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	
    dd.sendKeys("Headphones");
    WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
    search.click();
   
	}

}
