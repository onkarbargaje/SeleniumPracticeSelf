package locatorStrategy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromSpecificWebPageSection {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();

		// List<WebElement> rtSidePanelLink =
		// driver.findElements(By.xpath("//aside[@id='column-right']//a"));

		// System.out.println(rtSidePanelLink.size());

		// for (WebElement e : rtSidePanelLink) {
		// String text = e.getText();
		// System.out.println(text);
		// }

		By anchorTag = By.xpath("//aside[@id='column-right']//a");

		List<String> textOfEach = getElementTextList(anchorTag);
		System.out.println(textOfEach.contains("Login"));

	}

	public static List<String> getElementTextList(By locator) {
		List<String> eachEleText = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String elementText = e.getText();

			// from above it will return only first text as it is list
			// so we have to create empty ArratList and add text into this
			eachEleText.add(elementText);

		}
		return eachEleText;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
