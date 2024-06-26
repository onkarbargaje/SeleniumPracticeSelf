package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WBPopUpAmazon {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        dd.click();
        
        WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("mobile");
        Thread.sleep(4000);
        
        
        
        WebElement listElement=driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div[6]"));
        listElement.click();
        
   
        WebElement list1=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
        list1.click();
       
        
        //driver.close();

	}

}
