package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionDD {

	public static void main(String[] args) throws InterruptedException 
	{
	     ChromeDriver driver= new ChromeDriver();
		
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement search= driver.findElement(By.xpath("//textarea[@title='Search']"));
        
        WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(5));
        w1.until(ExpectedConditions.titleIs(driver.getTitle()));
        
        search.sendKeys("delhi");
        Thread.sleep(5000);
        List<WebElement> list= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        int count=list.size();
        System.out.println(count);
        
        
        
	}

}
