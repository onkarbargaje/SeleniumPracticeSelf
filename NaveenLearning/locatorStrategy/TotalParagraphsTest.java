package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalParagraphsTest {

	public static void main(String[] args) 
	{
		BrowserUtils broUtil= new BrowserUtils();
		WebDriver driver=broUtil.initDriver("firefox");
		broUtil.launchURL("https://classic.freecrm.com/");
		
		By paragraphTag=By.tagName("p");
		
		ElementUtils eleUtil= new ElementUtils(driver);
		List<WebElement> paraList=eleUtil.getElements(paragraphTag);
		
		for(int i=0; i<paraList.size(); i++)
		{
			String paraText=paraList.get(i).getText();
			System.out.println(i +":"+paraText);
		}

	}

}
