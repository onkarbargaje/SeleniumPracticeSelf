package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextOfLinks {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ref=nav_logo");
        List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
       System.out.println(totalLinks.size());
       
       for(WebElement link:totalLinks)
       {
    	   System.out.println(link.getText());
       }
	}

}
