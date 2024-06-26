package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownKeyBForLoop {

	public static void main(String[] args) throws InterruptedException 
	{
        ChromeDriver driver= new ChromeDriver();
		
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement DD=driver.findElement(By.id("gh-cat"));
		DD.click();
		
		Thread.sleep(3000);
		
		
		Select select= new Select(DD);
		List<WebElement>optionList=select.getOptions();
		
		for (WebElement option:optionList)
		{
			String optionText=option.getText();
			if (!optionText.isEmpty())
			{
				System.out.println(optionText);
			}
		}
		
		driver.quit();
		
	}

}
