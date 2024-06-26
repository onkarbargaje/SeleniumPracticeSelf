package otherLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//single selection
		while (true) {
			if(driver.findElements(By.xpath("//td[text()='Onkar']")).size()>0)
			{
				selectCountry("Onkar");
				break;
			}
			else
			{
				//pagination logic
				//click on Next button if not available on first page
				WebElement nextBt=driver.findElement(By.xpath("//a[text()='Next']"));
				if (nextBt.getAttribute("class").contains("disabled"))
				{
					System.out.println("Pagination is over.... country is not found");
					break;
				}
				nextBt.click();
				Thread.sleep(3000);
			}
			
		}
		
	}
	
	public static void selectCountry(String expCountry)
	{
		driver.findElement(By.xpath("//td[text()='"+expCountry+"']/parent::tr/td/input[@type=\"checkbox\"]")).click();
	}

}
