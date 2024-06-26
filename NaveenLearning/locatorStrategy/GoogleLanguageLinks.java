package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		By langLink = By.xpath("//div[@id='SIvCob']/a");

		doSelectLanguageLink(langLink, "मराठी");

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSelectLanguageLink(By locator, String expLanguage) {
		List<WebElement> langLinks = getElements(locator);

		for (WebElement e : langLinks) {
			String langText = e.getText();
			if (langText.contains(expLanguage)) {
				e.click();
				break;
			}

		}
		System.out.println("Expected language is selected " + expLanguage);
	}

}
