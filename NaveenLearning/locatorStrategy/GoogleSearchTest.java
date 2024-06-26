package locatorStrategy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// WebElement searchField=
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(3000);
		By list=By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		doClickOnSpecificOptionFromSuggList(list, "testing jobs in pune");

	}
	
	public static void doClickOnSpecificOptionFromSuggList(By suggList, String expOption)
	{
		List<WebElement> searchResult = driver
				.findElements(suggList);
		System.out.println(searchResult.size());
		for (WebElement e : searchResult) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(expOption)) {
				e.click();
				break;
			}
		}
	}

}
