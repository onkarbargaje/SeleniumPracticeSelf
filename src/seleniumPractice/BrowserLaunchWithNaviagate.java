package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchWithNaviagate {

	public static void main(String[] args) throws InterruptedException 
	{
        ChromeDriver driver= new ChromeDriver();
        //driver.get("https://www.amazon.in/");
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement hover=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();
        
       
        
	}

}
