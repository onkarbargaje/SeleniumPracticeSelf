package seleniumPractice;

import java.util.List;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterElementsList {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.freshworks.com/");
        driver.manage().window().maximize();
       Thread.sleep(10000);
        
        List<WebElement>footerItems=driver.findElements(By.xpath("//ul[@class='sc-ace17a57-0 sc-707e1bf3-3 jurjFh dueWL']//li"));

        
        for(WebElement fc:footerItems)
        {
        	String footerItemName=fc.getText();
        	System.out.println(footerItemName);
        }
        
        driver.quit();
        
	}

}
