package locatorStrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// String
		// ph=driver.findElement(By.name("firstname")).getAttribute("placeholder");

		// System.out.println(ph);

		By fname = By.name("firstname");

		String ph = getElementAttribute(fname, "placeholder");

		System.out.println(ph);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getElementAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}

}
