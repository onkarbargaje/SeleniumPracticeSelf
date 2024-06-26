package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWOutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();

		// List<WebElement> ddOptionsList=driver.findElements(countryOptions);
		// System.out.println(ddOptionsList.size());

		// for (WebElement e: ddOptionsList)
		// {
		// String text=e.getText();
		// System.out.println(text);
		// if(text.contains("India"))
		// {
		// e.click();
		// break;
		// }
		// }

		By countryOptions = By.xpath("//select[@name='Country']/option");

		doGetSelectOptionFromDD(countryOptions, "Hungary");

	}

	public static List<WebElement> doGetElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doGetSelectOptionFromDD(By locator, String expValue) {
		List<WebElement> ddOptions = doGetElements(locator);
		for (WebElement e : ddOptions) {
			String text = e.getText();
			if (text.contains(expValue)) {
				e.click();
				break;
			}
		}
	}

}
