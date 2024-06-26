package otherLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowserMultiWindowsHandles {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		Thread.sleep(3000);
		WebElement facebookEle = driver
				.findElement(By.xpath("(//a[contains(@href,'youtube') and @target='_blank'])[2]"));
		//WebElement linkedInEle = driver
				//.findElement(By.xpath("(//a[contains(@href,'linkedin') and @target='_blank'])[26]"));
		WebElement twitterEle = driver
				.findElement(By.xpath("(//a[contains(@href,'twitter') and @target='_blank'])[2]"));

		facebookEle.click();
		//linkedInEle.click();
		twitterEle.click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String WindowID = it.next();
			driver.switchTo().window(WindowID);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			if (!(WindowID.equals(parentWindowID))) {
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getCurrentUrl());

	}
}