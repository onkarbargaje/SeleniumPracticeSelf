package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Four extends LauchQuit
{
	@Test
	void Divide() throws InterruptedException
	{
        WebElement dd=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

	    dd.sendKeys("Microwaves");
	    WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
	    search.click();
	    
	}

}
