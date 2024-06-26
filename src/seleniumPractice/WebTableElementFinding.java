package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableElementFinding 
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		 driver= new ChromeDriver();
         driver.get("https://selectorshub.com/xpath-practice-page/");
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
         
         searchContentInTable("Garry White");
	}
	
	public static void searchContentInTable(String name)
	{
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
        List<WebElement> columns=driver.findElements(By.xpath("//table[@id='resultTable']//th"));
        
        int rowCount=rows.size();
        int columnCount= columns.size();
        
        System.out.println(rowCount);
        System.out.println(columnCount);
 
        for (int i=1; i<rowCount; i++)
        {
       	 for (int j=1; j<=columnCount; j++)
       	 {
       		 String mainXpath="//table[@id=\"resultTable\"]/tbody/tr["+i+"]/td["+j+"]";
       		 String tableContent=driver.findElement(By.xpath(mainXpath)).getText();
       		 if(tableContent.equalsIgnoreCase(name))
       		 {
       			 System.out.println(i + " :: "+ j);
       			 break;
       		 }
       		
       	 }
        }
        driver.close();
        
        
  		 
	}

}
