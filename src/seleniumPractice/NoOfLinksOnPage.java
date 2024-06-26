package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnPage {

	public static void main(String[] args) 
	{
ChromeDriver driver= new ChromeDriver();
		
        driver.get("https://grotechminds.com/");
        driver.manage().window().maximize();
        List<WebElement> noOfLinks= driver.findElements(By.tagName("a"));
        noOfLinks.size();
        System.out.println(noOfLinks.size());
        
        for(WebElement link: noOfLinks)
        {
        	String textOfLink=link.getText();
        	if (!textOfLink.isEmpty())
        	{
        	System.out.println(textOfLink);
        	}
        	
        }
        

	}

}
