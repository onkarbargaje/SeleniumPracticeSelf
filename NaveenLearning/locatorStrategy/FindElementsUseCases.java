package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By anchorTag = By.tagName("a");

		int countOfAnchorTag = getElementCount(anchorTag);
		System.out.println(countOfAnchorTag);

	}

	public static int getElementCount(By locator) {
		int elementCount=getElements(locator).size();
		System.out.println("Total element count is for   " + locator + " is "  + elementCount);
		return elementCount;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
