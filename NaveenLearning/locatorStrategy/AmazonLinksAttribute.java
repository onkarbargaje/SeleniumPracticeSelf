package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinksAttribute {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// List<WebElement> linksTag=driver.findElements(By.tagName("a"));

		By link = By.tagName("a");
		List<WebElement> linkList = getElements(link);

	//	for (WebElement e : linkList) {
	//		String hrefValue = e.getAttribute("href");
	//		String hrefText = e.getText();
	//		System.out.println(hrefValue + " : " + hrefText);
	//	}
		
		getElementAttributes(link, "href");

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementAttributes(By locator, String attributeName)
	{
		List<WebElement> eleList=getElements(locator);
		for (WebElement e: eleList)
		{
			String attributeValue=e.getAttribute(attributeName);
			System.out.println(attributeValue);
		}
		
	}

}
