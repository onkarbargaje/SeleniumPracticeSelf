package otherLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableMultiSelection {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> countryli = driver.findElements(By.xpath("//tbody[@class='row-hover']/tr/td[text()='Denmark']"));
		int countryCount = countryli.size();
		int clickCount = 0;
		while (true) {
			if (countryCount > 0) {
				List<WebElement> checkBox = driver
						.findElements(By.xpath("//td[text()='Denmark']/parent::tr/td/input[@type=\"checkbox\"]"));
				for (WebElement e : checkBox) {

					e.click();
					Thread.sleep(500);
					clickCount++;

				}
			}

			WebElement nextBt = driver.findElement(By.xpath("//a[text()='Next']"));
			if (nextBt.getAttribute("class").contains("disabled")) {
				System.out.println("Pagination is over.... country is not found");
				break;
			}
			nextBt.click();

		}

	}

}
