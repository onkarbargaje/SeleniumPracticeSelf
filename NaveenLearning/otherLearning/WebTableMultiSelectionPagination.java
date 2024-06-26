package otherLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableMultiSelectionPagination {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//String expCountry="India";
		
		while(true)
		{
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0)
			{
				List<WebElement>checkBox=driver.findElements(By.xpath("//input[@type='checkbox']/parent::td/parent::tr/parent::tbody[@class='row-hover']//td/input"));
				for(WebElement e:checkBox)
				{
					String country=e.getText();
					if(country.contains("India"))
					{
						e.click();
						Thread.sleep(2000);
					}
					
				}
			}
			else
			{
				WebElement nextBt=driver.findElement(By.xpath("//a[text()='Next']"));
				nextBt.click();
			}
		}

	}
}
