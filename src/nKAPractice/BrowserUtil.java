package nKAPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	private WebDriver driver;

	public WebDriver initDriver(String browserName) {
		switch (browserName) {
		case ("chrome"):
			driver = new ChromeDriver();
			break;
		case ("firefox"):
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Please enter correct browser name");
			break;
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;

	}

	public void launchUrl(String url) {
		driver.get(url);
	}

}
