package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) 
	{

         WebDriver driver= new ChromeDriver();
         driver.get("https://www.w3schools.com/html/html_tables.asp");
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
         
        List<WebElement> tableRows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
        List<WebElement> tableColumns= driver.findElements(By.xpath("//table[@id='customers']//th"));
        
        System.out.println(tableRows.size());
        System.out.println(tableColumns.size());
        
        for (int row=2; row<=tableRows.size(); row++)
        {
        	for (int column=1; column<=tableColumns.size(); column++)
        	{
        		String xpathMain= "//table[@id='customers']//tr["+row+"]/td["+column+"]";
        		String text=driver.findElement(By.xpath(xpathMain)).getText();
        		System.out.print(text + "||");
        	}
        	System.out.println();
        	System.out.println("_____________________________________________________________");
        }
        
        driver.close();
	}

}
