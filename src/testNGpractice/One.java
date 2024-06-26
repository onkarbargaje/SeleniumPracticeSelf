package testNGpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class One extends LauchQuit
{
	

	@Test
	void sub() throws InterruptedException
	{
        WebElement dd=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        dd.sendKeys("Mobile");
        WebElement search=driver.findElement(By.xpath("//input[@type='submit']"));
        search.click();
        
	}
	


}
